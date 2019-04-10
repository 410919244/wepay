package me.hao0.wepay.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import me.hao0.common.exception.XmlException;

/**
 * 简陋的XML读取器
 * (从ihaolin的core包中复制出来修改的)
 * @author zJun
 * @date 2018年7月13日 上午9:49:30
 */
public class XmlReaders {

    private static ThreadLocal<DocumentBuilder> docBuildeIns = new ThreadLocal<DocumentBuilder>() {
        protected DocumentBuilder initialValue() {
            try {
            	// 修复XXE漏洞
            	// 详情请参考：https://mp.weixin.qq.com/s?__biz=MzU4NDU5MjA2Mw==&mid=2247483670&idx=1&sn=77f4236ad3528ebc4e00b9203ebcbf88&chksm=fd963ec6cae1b7d07628fcf9a085af6a5415257f558c87a5fa226b20c98a5866a0a69c1bc6ed&mpshare=1&scene=1&srcid=0712cttPtcG9uUmVPWuVLGZV#rd
            	DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            	dbf.setExpandEntityReferences(false);
            	dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING,true);
                return DocumentBuilderFactory.newInstance().newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                throw new IllegalStateException("DocumentBuilder 对象初始化失败！", e);
            }
        }
    };

    private Document document;

    private XmlReaders(){}

    public static XmlReaders create(String xml){
        return create(xml, "UTF-8");
    }

    public static XmlReaders create(String xml, String encode){
        try {
            return create(new ByteArrayInputStream(xml.getBytes(encode)));
        } catch (UnsupportedEncodingException e) {
            throw new XmlException(e);
        }
    }

    public static XmlReaders create(InputStream inputStream){
        XmlReaders readers = new XmlReaders();
        try {
            readers.document = docBuildeIns.get().parse(inputStream);
        } catch (Exception e) {
            throw new XmlException("Xmls create fail", e);
        }
        return readers;
    }

    public Node getNode(String tagName){
        NodeList nodes = document.getElementsByTagName(tagName);
        if (nodes.getLength() <= 0){
            return null;
        }
        return nodes.item(0);
    }

    public NodeList getNodes(String tagName){
        NodeList nodes = document.getElementsByTagName(tagName);
        if (nodes.getLength() <= 0){
            return null;
        }
        return nodes;
    }

    /**
     * 获取某个节点的文本内容，若有多个该节点，只会返回第一个
     * @param tagName 标签名
     * @return 文本内容，或NULL
     */
    public String getNodeStr(String tagName){
        Node node = getNode(tagName);
        return node == null ? null : node.getTextContent();
    }

    /**
     * 获取某个节点的Integer，若有多个该节点，只会返回第一个
     * @param tagName 标签名
     * @return Integer值，或NULL
     */
    public Integer getNodeInt(String tagName){
        String nodeContent = getNodeStr(tagName);
        return nodeContent == null ? null : Integer.valueOf(nodeContent);
    }

    /**
     * 获取某个节点的Long值，若有多个该节点，只会返回第一个
     * @param tagName 标签名
     * @return Long值，或NULL
     */
    public Long getNodeLong(String tagName){
        String nodeContent = getNodeStr(tagName);
        return nodeContent == null ? null : Long.valueOf(nodeContent);
    }

    /**
     * 获取某个节点的Float，若有多个该节点，只会返回第一个
     * @param tagName 标签名
     * @return Float值，或NULL
     */
    public Float getNodeFloat(String tagName){
        String nodeContent = getNodeStr(tagName);
        return nodeContent == null ? null : Float.valueOf(nodeContent);
    }
}
