import org.yaml.snakeyaml.Yaml


stepsYamlFile = "stepsSI.yml"
        Yaml yamlParser = new Yaml()
        def stepsYaml = yamlParser.load((stepsYamlFile as File).text)
        stepsYaml.each { step ->
            if (stepsYaml[step].type.toString().toUpperCase().equals('PLSQL')){
                def stepDescription = stepsYaml[step].description.toString()
                def stepQuery = stepsYaml[step].query.toString()                                
            }}
            println stepQuery
                
                sleep 7
            
            