package nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SentimentRun {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(SentenceRun.class);
        String txt = "The Lakers had dropped three of their last four at staples Center but didn't have any problems against the undersized Suns.";
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline() ;
        CoreDocument doc = new CoreDocument(txt) ;
        stanfordCoreNLP.annotate(doc) ;
        List<CoreSentence> sens=doc.sentences() ;
        for(CoreSentence sen:sens){
            String sentiment = sen.sentiment();
            System.out.println(sen + "/t" + sentiment);
        }
    }



}
