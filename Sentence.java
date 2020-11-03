// In this class, entire text is divided into a no. of paragraphs & each paragraph into a no. of sentences 
class Sentence{
	// 2 numbers given to each sentence.
	int paragraphNumber; // Indicates which paragraph the sentence is a part of.
	int number; // Sentence number w.r.t the entire text.
	int stringLength; // No. of characters in the sentence.
	double score;
	int noOfWords; 
	String value; // Actual string

	Sentence(int number, String value, int stringLength, int paragraphNumber){
		this.number = number;
		this.value = new String(value);
		this.stringLength = stringLength;
		noOfWords = value.split("\\s+").length; // Computed manually by Word Tokenizing a sentence.
		score = 0.0; // Score indicates importance/ how frequently it appears, initialized to 0.
		this.paragraphNumber=paragraphNumber;
	}
}