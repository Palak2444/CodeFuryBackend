import java.util.List;

public class Invoice {
    private int uniqueInvoiceId;
    private String invoiceDate;
    private Order orderDetails;
    private String customerDetails;
    private List<ProductWithGST> productsWithGST;
    private String gstType;
    private double totalGSTAmount;
    private double totalInvoiceValue;
    private String status;

    public Invoice() {
        // Default constructor
    }

    public Invoice(int uniqueInvoiceId, String invoiceDate, Order orderDetails, String customerDetails,
                   List<ProductWithGST> productsWithGST, String gstType, double totalGSTAmount,
                   double totalInvoiceValue, String status) {
        this.uniqueInvoiceId = uniqueInvoiceId;
        this.invoiceDate = invoiceDate;
        this.orderDetails = orderDetails;
        this.customerDetails = customerDetails;
        this.productsWithGST = productsWithGST;
        this.gstType = gstType;
        this.totalGSTAmount = totalGSTAmount;
        this.totalInvoiceValue = totalInvoiceValue;
        this.status = status;
    }

    // Getter and Setter methods for each instance variable

    public int getUniqueInvoiceId() {
        return uniqueInvoiceId;
    }

    public void setUniqueInvoiceId(int uniqueInvoiceId) {
        this.uniqueInvoiceId = uniqueInvoiceId;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Order getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Order orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<ProductWithGST> getProductsWithGST() {
        return productsWithGST;
    }

    public void setProductsWithGST(List<ProductWithGST> productsWithGST) {
        this.productsWithGST = productsWithGST;
    }

    public String getGstType() {
        return gstType;
    }

    public void setGstType(String gstType) {
        this.gstType = gstType;
    }

    public double getTotalGSTAmount() {
        return totalGSTAmount;
    }

    public void setTotalGSTAmount(double totalGSTAmount) {
        this.totalGSTAmount = totalGSTAmount;
    }

    public double getTotalInvoiceValue() {
        return totalInvoiceValue;
    }

    public void setTotalInvoiceValue(double totalInvoiceValue) {
        this.totalInvoiceValue = totalInvoiceValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "uniqueInvoiceId=" + uniqueInvoiceId +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", orderDetails=" + orderDetails +
                ", customerDetails='" + customerDetails + '\'' +
                ", productsWithGST=" + productsWithGST +
                ", gstType='" + gstType + '\'' +
                ", totalGSTAmount=" + totalGSTAmount +
                ", totalInvoiceValue=" + totalInvoiceValue +
                ", status='" + status + '\'' +
                '}';
    }
}
