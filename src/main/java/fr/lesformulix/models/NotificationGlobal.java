package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name="notifications_global")
public class NotificationGlobal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private Timestamp created_at;
    @Column(nullable = false)
    private byte notification_type;

    @Size(min = 10, max = 255)
    private String content_preview;

    @Column(nullable = false)
    private String content;

    public NotificationGlobal(){
    }

    public NotificationGlobal(long id, Timestamp created_at, byte notification_type, String content_preview, String content) {
        this.id = id;
        this.created_at = created_at;
        this.notification_type = notification_type;
        this.content_preview = content_preview;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public byte getNotification_type() {
        return notification_type;
    }

    public void setNotification_type(byte notification_type) {
        this.notification_type = notification_type;
    }

    public String getContent_preview() {
        return content_preview;
    }

    public void setContent_preview(String content_preview) {
        this.content_preview = content_preview;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NotificationGlobal{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", notification_type=" + notification_type +
                ", content_preview='" + content_preview + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
