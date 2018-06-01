package io.paymenthighway.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Pivo Transaction status POJO
 */
public class PivoTransactionStatus {
  private UUID id;
  private String type;
  private String amount;
  @JsonProperty("current_amount")
  private String currentAmount;
  private String currency;
  private String timestamp;
  @JsonProperty("status")
  private Status status;
  @JsonProperty("reference_number")
  private String referenceNumber;
  private Customer customer;
  private String order;
  @JsonProperty("pivo_payment_id")
  private String pivoPaymentId;
  private String phone;
  @JsonProperty("payment_type")
  private String paymentType;
  @JsonProperty("archive_id")
  private String archiveId;
  private String modified;
  private PivoRefund[] refunds;

  public UUID getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getAmount() {
    return amount;
  }

  public String getCurrentAmount() {
    return currentAmount;
  }

  public String getCurrency() {
    return currency;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public Status getStatus() {
    return status;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }

  public Customer getCustomer() {
    return customer;
  }

  public String getOrder() {
    return order;
  }

  public String getPivoPaymentId() {
    return pivoPaymentId;
  }

  public String getPhone() {
    return phone;
  }

  public String getPaymentType() {
    return paymentType;
  }

  public String getArchiveId() {
    return archiveId;
  }

  public String getModified() {
    return modified;
  }

  public PivoRefund[] getRefunds() {
    return refunds;
  }
}
