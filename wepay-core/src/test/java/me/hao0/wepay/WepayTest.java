package me.hao0.wepay;

/**
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 25/11/15
 */
public class WepayTest {

//    private Wepay wepay;
//
//    private String openId = "onN_8trIW7PSoXLMzMSWySb5jfdY";
//
//    @Before
//    public void init() throws IOException {
//        Properties props = new Properties();
//        InputStream in = Object.class.getResourceAsStream("/dev.properties");
//        props.load(in);
//        in.close();
//
//        Path path = Paths.get("/Users/haolin/GitHub/wepay/wepay-core/src/test/resources/cert.p12");
//        byte[] data = Files.readAllBytes(path);
//        
//        wepay = WepayBuilder.newBuilder(
//                props.getProperty("appId"),
//                props.getProperty("appKey"),
//                props.getProperty("mchId"))
//                .certPasswd(props.getProperty("mchId"))
//                .certs(data)
//                .build();
//
//
//    }
//
//    @Test
//    public void testJsPay(){
//        JsPayRequest request = new JsPayRequest();
//        request.setBody("测试订单");
//        request.setClientId("127.0.0.1");
//        request.setTotalFee(1);
//        request.setNotifyUrl("http://www.xxx.com/notify");
//        request.setOpenId(openId);
//        request.setOutTradeNo("TEST12345678js");
//        request.setTimeStart(Dates.now("yyyyMMddHHmmss"));
//        JsPayResponse resp = wepay.pay().jsPay(request);
//        assertNotNull(resp);
//        System.out.println(resp);
//    }
//
//    @Test
//    public void testQrPay(){
//        QrPayRequest request = new QrPayRequest();
//        request.setBody("测试订单");
//        request.setClientId("127.0.0.1");
//        request.setTotalFee(1);
//        request.setNotifyUrl("http://www.xxx.com/notify");
//        request.setOutTradeNo("TEST1122334455");
//        request.setTimeStart(Dates.now("yyyyMMddHHmmss"));
//        QrPayResponse resp = wepay.pay().qrPay(request);
//        assertNotNull(resp);
//        System.out.println(resp);
//    }
//
//    @Test
//    public void testQrPayConvert(){
//        QrPayRequest request = new QrPayRequest();
//        request.setBody("测试订单");
//        request.setClientId("127.0.0.1");
//        request.setTotalFee(1);
//        request.setNotifyUrl("http://www.xxx.com/notify");
//        request.setOutTradeNo("TEST3344520");
//        request.setTimeStart(Dates.now("yyyyMMddHHmmss"));
//        QrPayResponse resp = wepay.pay().qrPay(request, Boolean.TRUE);
//        assertNotNull(resp);
//        System.out.println(resp);
//    }
//
//    @Test
//    public void testAppPay(){
//        PayRequest request = new PayRequest();
//        request.setBody("测试订单");
//        request.setClientId("127.0.0.1");
//        request.setTotalFee(1);
//        request.setNotifyUrl("http://www.xxx.com/notify");
//        request.setOutTradeNo("TEST12345678app");
//        request.setTimeStart(Dates.now("yyyyMMddHHmmss"));
//        AppPayResponse resp = wepay.pay().appPay(request);
//        assertNotNull(resp);
//        System.out.println(resp);
//    }
//
//    @Test
//    public void testQueryOrderByOutTradeNo(){
//        WePayOrder order = wepay.order().queryByOutTradeNo("TEST3344520");
//        assertNotNull(order);
//        System.out.println(order);
//    }
//
//    @Test
//    public void testQueryOrderByTransactionId(){
//        WePayOrder order = wepay.order().queryByTransactionId("1000530784201510111158030445");
//        assertNotNull(order);
//        System.out.println(order);
//    }
//
//    @Test
//    public void testCloseOrder(){
//        assertTrue(wepay.order().closeOrder("TEST12345678"));
//    }
//
//    @Test
//    public void testRefundApply(){
//        RefundApplyRequest req = new RefundApplyRequest();
//        req.setTransactionId("1003110578201512021860142525");
//        req.setOutRefundNo("TEST3344520");
//        req.setTotalFee(1);
//        req.setRefundFee(1);
//        req.setOpUserId(wepay.getMchId());
//
//        RefundApplyResponse resp = wepay.refund().apply(req);
//        assertNotNull(resp);
//        System.out.println(resp);
//    }
//
//    @Test
//    public void testRefundQuery(){
//        RefundQueryResponse resp = wepay.refund().queryByOutTradeNo("TEST3344556677");
//        assertNotNull(resp);
//        System.out.println(resp);
//
//        wepay.refund().queryByOutRefundNo("TEST3344556677");
//        assertNotNull(resp);
//        System.out.println(resp);
//
//        wepay.refund().queryByTransactionId("1003110578201511281803217943");
//        assertNotNull(resp);
//        System.out.println(resp);
//
//        wepay.refund().queryByRefundId("2003110578201512010090200506");
//        assertNotNull(resp);
//        System.out.println(resp);
//
//    }
//
//    @Test
//    public void testQueryBill(){
//        BillDetail<CommonBill> allBill = wepay.bill().queryAll(null, "20151203");
//        assertNotNull(allBill);
//        assertEquals(allBill.getBills().size(), allBill.getCount().getTradeTotalCount().intValue());
//        System.out.println(allBill.getBills().get(0));
//        System.out.println(allBill.getCount());
//
//        BillDetail<Bill> successBill = wepay.bill().querySuccess(null, "20151203");
//        assertNotNull(successBill);
//        assertEquals(successBill.getBills().size(), successBill.getCount().getTradeTotalCount().intValue());
//        System.out.println(successBill.getBills().get(0));
//        System.out.println(successBill.getCount());
//
//        BillDetail<RefundBill> refundBill = wepay.bill().queryRefund(null, "20151203");
//        assertNotNull(refundBill);
//        assertEquals(refundBill.getBills().size(), refundBill.getCount().getTradeTotalCount().intValue());
//        System.out.println(refundBill.getBills().get(0));
//        System.out.println(refundBill.getCount());
//    }
}
