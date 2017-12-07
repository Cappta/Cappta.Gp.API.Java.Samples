Cappta.Gp.API.Java.Samples

Para utilização da DLL em soluções Java é necessário utilizar o Com4j uma biblioteca responsável por gerar definições de tipo Java de uma biblioteca do tipo COM

Para saber mais sobre Com4j: http://com4j.kohsuke.org/tutorial.html

Como utilizar?

Utilizando o CMD, navegue até a pasta onde ira criar o projeto, esta pasta devera conter o Com4j previaente baixado do site citado acima e executar este comando:

java -jar tlbimp.jar -o com4j -p Com.Api.Java "C:\Program Files (x86)\CAPPTA\CapptaGpPlus\Cappta.Gp.Api.Com.tlb"

Depois arraste o arquivo gerado para dentro de seu projeto
