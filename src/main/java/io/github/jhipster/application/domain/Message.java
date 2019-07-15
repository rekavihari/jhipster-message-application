package io.github.jhipster.application.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Message.
 */
@Entity
@Table(name = "message")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sender")
    private String sender;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "topic")
    private String topic;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "image_content_type")
    private String imageContentType;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public Message sender(String sender) {
        this.sender = sender;
        return this;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public Message recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTopic() {
        return topic;
    }

    public Message topic(String topic) {
        this.topic = topic;
        return this;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public byte[] getImage() {
        return image;
    }

    public Message image(byte[] image) {
        this.image = image;
        return this;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public Message imageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
        return this;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Message imageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Message latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Message longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }
        return id != null && id.equals(((Message) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Message{" +
            "id=" + getId() +
            ", sender='" + getSender() + "'" +
            ", recipient='" + getRecipient() + "'" +
            ", topic='" + getTopic() + "'" +
            ", image='" + getImage() + "'" +
            ", imageContentType='" + getImageContentType() + "'" +
            ", imageURL='" + getImageURL() + "'" +
            ", latitude=" + getLatitude() +
            ", longitude=" + getLongitude() +
            "}";
    }
}
