/**
 * 
 */
package model;

/**
 * @author aureliadelaune
 *
 */
public class Storage {

	private int identifiantStorage;
	private String url;
	private int size;
	
	/**
	 * default constructor for the Storage entity.
	 */
	public Storage() {
		super();
	}
	
	/**
	 * full constructor for the Storage entity, with:
	 * @param identifiantStorage
	 * @param url
	 * @param size
	 */
	public Storage(int identifiantStorage, String url, int size) {
		super();
		this.identifiantStorage = identifiantStorage;
		this.url = url;
		this.size = size;
	}

	/**
	 * @return the identifiantStorage
	 */
	public int getIdentifiantStorage() {
		return identifiantStorage;
	}

	/**
	 * @param identifiantStorage the identifiantStorage to set
	 */
	public void setIdentifiantStorage(int identifiantStorage) {
		this.identifiantStorage = identifiantStorage;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
