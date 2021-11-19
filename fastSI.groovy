import groovy.sql.Sql
import org.yaml.snakeyaml.Yaml
import java.util.concurrent.Future
import groovyx.gpars.GParsPool

class EkpDb {

    Boolean executeStepList(String stepsYamlFile, String stepsList){
        Boolean success

        Yaml yamlParser = new Yaml()
        def stepsYaml = yamlParser.load((stepsYamlFile as File).text)
        stepsYaml.split(',').each { step ->
            if (stepsYaml[step].type.toString().toUpperCase().equals('PLSQL')){
                def stepDescription = stepsYaml[step].description.toString()
                def stepQuery = stepsYaml[step].query.toString()    
                try {
                    writeln 'Query: ' + stepQuery
                    success = true
                }                 
                catch (Exception ex) {          
                return ex
                }
            
            }

        }

    }
}