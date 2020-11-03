# text-summarizer
A Java application which gives a summary of any input text/article.

## The Algorithm
1. Take the full CONTENT and split it into PARAGRAPHS. 
2. Split each paragraph into SENTENCES. 
3. Compare every sentence with every other. This is done by Counting the number of common words and then Normalize this by dividing by average number of words per sentence
4. These intermediate scores/values are stored in an INTERSECTION matrix
5. Create the key-value dictionary
	- Key : Sentence
	- Value : Sum of intersection values with this sentence
6. From every paragraph, extract the sentences  with the highest score.
7. Sort the selected sentences in order of appearance in the original text to preserve content and meaning.

And like that, you have generated a summary of the original text.

## Run the program
Run the improved_summary.java file and you will see the summary with stats displayed towards the bottom of the window.
