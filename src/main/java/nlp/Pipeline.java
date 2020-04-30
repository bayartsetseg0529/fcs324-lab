package nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    public static Properties properties;
    public static String propertiesName = "tokenize, ssplit, pos, lemma, parse, sentiment , ner";
    public static StanfordCoreNLP stanfordCoreNLP;
    private Pipeline(){}
        static{
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
        }
        public static StanfordCoreNLP getPipeline(){
        if(stanfordCoreNLP==null){
            stanfordCoreNLP= new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
        }

}
