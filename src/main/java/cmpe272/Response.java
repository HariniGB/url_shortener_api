package cmpe272;

public class Response {

	private final String shortenedURL;
	private final String originalURL;
	private final String userID;
	private final String Status;

	public Response(String shortenedURL, String originalURL, String userID, String Status) {
		this.shortenedURL = shortenedURL;
		this.originalURL = originalURL;
		this.userID = userID;
		this.Status = Status;
	}

	public String getShorternedURL() {
		return this.shortenedURL;
	}

	public String getOriginalURL() {
		return this.originalURL;
	}

 	public String getUserID() {
		return this.userID;
	}

	public String getStatus() {
		return this.Status;
	}
}
