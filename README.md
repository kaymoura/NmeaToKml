# NmeaToKml

ESCOPO NMEA to KML

OBJETIVO GERAL
Apresentar os dados NMEA em formato KML.

INTRODUÇÃO
O VANT (Veículo Aereo Não Tripulado) EGK-01 é um veículo inteligente, de uso militar,  que faz parte de um sistema de rastreamento marítimo aonde o foco principal é identificar  piratas na costa brasileira. Devido ao uso exclusivo do sistema de comunicação, o VANT se  comunica com a base a cada 1 hora, enviando dados no formato de arquivo texto contendo  informações sobre sua viagem, utilizando o formato de sentenças NMEA 0183 (National  Marine Eletronics Association). A equipe de solo necessita apresentar esses dados de viagem em formato mais amigável,  utilizando o padrão KML. O formato KML foi desenvolvido pela Google e tornou-se o padrão  adotado pelo OGC – Open Geospatial Consortium em 2008. Atualmente é o principal formato  de representação de waypoints (ponto) e tracks (trilhas) do aplicativo Google Earth e também  suportado por diversos programas de georefenciamento e tratamento de dados de GPS, como  o ArcGis, TrackMaker, USAPhotoMaps, entre outros.

OBJETIVO ESPECIFICO

1 - Coletar as coordenadas latitude e longitude, fornecida nos dados NMEA do arquivo texto. – Exemplo de arquivo: vant01.nmea.

2 - Apresentar o primeiro e último registro de localização como waypoint.

3 - Apresentar tracklog de caminho percorrido utilizando as coordenadas coletadas no NMEA no intervalo entre o segundo e o penúltimo registro de localização.

4 - Apresentar a cada 10 registros do tracklog, um waypoint com nomenclatura Pn, aonde n é o número sequencial do ponto. Exemplo: P1, P2, P3, ..., PN.

5 - Elaborar um arquivo do tipo KML de acordo com o modelo fornecido no arquivo exemplo.kml.

6 - Utilizar arquivos de layout para waypoints (waypoint.layout) e track (tracklog.layout).

 SOLICITAÇÕES ESPECIFICAS DADAS PELA EQUIPE DE SOLO

• Nome do projeto: NmeaToKml com main localizada na classe NmeaToKml.

• Aceitar via linha de comando os argumentos de nome do arquivo de entrada (txt) e o nome do arquivo de saída (kml) – e trata-los quando não fornecidos (ou solicitar ou mostrar mensagem de ajuda).

• Ser orientado a objetos e atender o conceito de herança para waypoints e outras classes que achar necessária. (Lembre-se: Pergunte se ClasseFilha é um ClassePai)

• Atributos devem ser private.

• Ser capaz de trabalhar com os layouts principal, waypoint e tracklog para fornecer o arquivo final.


