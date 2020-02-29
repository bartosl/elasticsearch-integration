###### Elasticsearch-integration


# Here is sample how to use

`// start embedded elasti
 EmbeddedElastic embeddedElastic = EmbeddedElastic.builder()
                .withElasticVersion("7.6.0")
                .withSetting(PopularProperties.HTTP_PORT, ElasticTestUtils.ELASTIC_PORT)
                .withSetting(PopularProperties.CLUSTER_NAME, "my_cluster2")
                .withSetting("xpack.ml.enabled", false)
                .withStartTimeout(2, TimeUnit.MINUTES)
                .withIndex("admissions").build().start();


// stop elastic
embeddedElastic.stop();`


**here is my btc address if is helpful for. You can buy me a coffee.**

19sqKaYqEFW23hEDNPNWTRxmCnkMXrbbQ4


