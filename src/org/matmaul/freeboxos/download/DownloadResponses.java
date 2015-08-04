package org.matmaul.freeboxos.download;

import org.matmaul.freeboxos.internal.Response;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rtrompier
 * Date: 04/08/2015
 * Time: 11:25
 */
public class DownloadResponses {
    public static class DownloadEntriesResponse extends Response<List<DownloadEntry>> {
    }

    public static class DownloadEntryResponse extends Response<DownloadEntry> {
    }

    public static class DownloadAddEntry extends Response<org.matmaul.freeboxos.download.DownloadAddEntry>{
    }

    public static class DownloadAddResponse extends Response<org.matmaul.freeboxos.download.DownloadAddResponse>{
    }
}
