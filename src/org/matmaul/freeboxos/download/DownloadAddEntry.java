package org.matmaul.freeboxos.download;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by IntelliJ IDEA.
 * User: rtrompier
 * Date: 04/08/2015
 * Time: 00:32
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DownloadAddEntry {
    private String download_url;
    private String download_url_list;
    private String download_dir;
    private Boolean recursive;
    private String username;
    private String password;
    private String archive_password;
    private String cookies;

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getDownload_url_list() {
        return download_url_list;
    }

    public void setDownload_url_list(String download_url_list) {
        this.download_url_list = download_url_list;
    }

    public String getDownload_dir() {
        return download_dir;
    }

    public void setDownload_dir(String download_dir) {
        this.download_dir = download_dir;
    }

    public Boolean isRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArchive_password() {
        return archive_password;
    }

    public void setArchive_password(String archive_password) {
        this.archive_password = archive_password;
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }
}
