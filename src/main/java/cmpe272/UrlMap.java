package cmpe272;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UrlMap")
public class UrlMap {

	@Id
	public String id;
	public String userId;
	public String oURL;
	public String sURL;

	public UrlMap() {

	}

	public UrlMap(String originalURL, String shortenedURL, String userID) {
		this.oURL = originalURL;
		this.sURL = shortenedURL;
		this.userId = userID;
	}

	@Override
	public String toString() {
		return String.format("UrlMap[id=%s, oURL='%s', sURL='%s', userId='%s']", id, oURL, sURL, userId);
	}
}
