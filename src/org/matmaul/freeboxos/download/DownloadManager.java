package org.matmaul.freeboxos.download;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

import java.util.List;

public class DownloadManager {
	protected RestManager restManager;

	public DownloadManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public List<DownloadEntry> getDownloads() throws FreeboxException {
		return restManager.get("downloads/", DownloadResponses.DownloadEntriesResponse.class);
	}
	
	public DownloadEntry getDownload(Long id) throws FreeboxException {
		return restManager.get("downloads/" + id.toString(), DownloadResponses.DownloadEntryResponse.class);
	}

	public DownloadAddResponse addDownload(DownloadAddEntry download) throws FreeboxException {
		return restManager.post("downloads/add", restManager.createUrlEncodedEntity(download), DownloadResponses.DownloadAddResponse.class);
	}

}
