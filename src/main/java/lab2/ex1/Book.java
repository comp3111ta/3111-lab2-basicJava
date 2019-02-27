package lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for (int i = 0; i < chapters.length; i++)
			chapters[i] = "Chapter "  + i;
	}
	public Book(String argument[]) {
		// construct the object with an array of chapter names
		chapters = new String[argument.length];
		for (int i = 0; i < chapters.length; i++)
			chapters[i] = argument[i];
	}

	public String getChapter(int i) {
		//return the chapter bt the given index. If the index is < 0 or >= to the array size,
		//return "invalid chapter"
		if (i < 0 || i >= chapters.length)
			return "invalid chapter";
		return chapters[i];
	}
	public String[] getChapters() {
		return chapters;
	}
}