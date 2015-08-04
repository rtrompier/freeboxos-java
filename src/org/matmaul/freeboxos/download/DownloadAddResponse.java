package org.matmaul.freeboxos.download;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by IntelliJ IDEA.
 * User: rtrompier
 * Date: 04/08/2015
 * Time: 00:32
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DownloadAddResponse {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}