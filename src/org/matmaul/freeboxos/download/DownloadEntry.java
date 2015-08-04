package org.matmaul.freeboxos.download;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by IntelliJ IDEA.
 * User: rtrompier
 * Date: 04/08/2015
 * Time: 00:32
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DownloadEntry {
    private Long id;
    private String type;
    private String name;
    private String status;
    private Long rx_bytes;
    private Long tx_bytes ;
    private Long rx_rate  ;
    private Long tx_rate  ;
    private Long queue_pos  ;
    private Long size ;
    private String io_priority;
    private Long tx_pct;
    private Long rx_pct;
    private Long eta;
    private Long stop_ratio;
    private String archive_password ;
    private String download_dir;
    private String created_ts;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCreated_ts() {
        return created_ts;
    }

    public void setCreated_ts(String created_ts) {
        this.created_ts = created_ts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRx_bytes() {
        return rx_bytes;
    }

    public void setRx_bytes(Long rx_bytes) {
        this.rx_bytes = rx_bytes;
    }

    public Long getTx_bytes() {
        return tx_bytes;
    }

    public void setTx_bytes(Long tx_bytes) {
        this.tx_bytes = tx_bytes;
    }

    public Long getRx_rate() {
        return rx_rate;
    }

    public void setRx_rate(Long rx_rate) {
        this.rx_rate = rx_rate;
    }

    public Long getTx_rate() {
        return tx_rate;
    }

    public void setTx_rate(Long tx_rate) {
        this.tx_rate = tx_rate;
    }

    public Long getQueue_pos() {
        return queue_pos;
    }

    public void setQueue_pos(Long queue_pos) {
        this.queue_pos = queue_pos;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getIo_priority() {
        return io_priority;
    }

    public void setIo_priority(String io_priority) {
        this.io_priority = io_priority;
    }

    public Long getTx_pct() {
        return tx_pct;
    }

    public void setTx_pct(Long tx_pct) {
        this.tx_pct = tx_pct;
    }

    public Long getRx_pct() {
        return rx_pct;
    }

    public void setRx_pct(Long rx_pct) {
        this.rx_pct = rx_pct;
    }

    public Long getEta() {
        return eta;
    }

    public void setEta(Long eta) {
        this.eta = eta;
    }

    public Long getStop_ratio() {
        return stop_ratio;
    }

    public void setStop_ratio(Long stop_ratio) {
        this.stop_ratio = stop_ratio;
    }

    public String getArchive_password() {
        return archive_password;
    }

    public void setArchive_password(String archive_password) {
        this.archive_password = archive_password;
    }

    public String getDownload_dir() {
        return download_dir;
    }

    public void setDownload_dir(String download_dir) {
        this.download_dir = download_dir;
    }
}
