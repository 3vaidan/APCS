import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {
	private static List<DownloadInfo> downloadList;

	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInfo>();
	}

	public static DownloadInfo getDownloadInfo(String title) {
		for(int currentSong = 0; currentSong < downloadList.size(); currentSong++) {
			if(downloadList.get(currentSong).getTitle().equalsIgnoreCase(title.trim()))
				return downloadList.get(currentSong);
		}
		return null;
	}

	public static void updateDownloads(List<String> titles) {
		for(int currentTitle = 0; currentTitle < titles.size(); currentTitle++) {
			boolean exists = false;
			for(int currentSong = 0; currentSong < downloadList.size(); currentSong++) {
				if(downloadList.get(currentSong).getTitle().equalsIgnoreCase(titles.get(currentTitle))) {
					exists = true;
					downloadList.get(currentSong).incrementTimesDownloaded();
				}
			}
			if(!exists) {
				DownloadInfo song = new DownloadInfo(titles.get(currentTitle).trim());
				downloadList.add(song);
			}
		}

	}
}
