x10 -ss1024m -ms8192m -mx8192m -libpath=./build -classpath .:build:build/classes:build/classes/com/yahoo/ycsb/db:build/classes/org/ycsbgraph/generator:build/classes/org/ycsbgraph/workloads:build/ycsb.jar:db/titan/lib/commons-beanutils-1.8.0.jar:db/titan/lib/commons-beanutils-core-1.8.0.jar:db/titan/lib/commons-collections-3.2.1.jar:db/titan/lib/commons-configuration-1.6.jar:db/titan/lib/commons-digester-1.8.1.jar:db/titan/lib/commons-lang-2.4.jar:db/titan/lib/commons-logging-1.1.1.jar:db/titan/lib/geronimo-jta_1.1_spec-1.1.1.jar:db/titan/lib/jersey-bundle-1.11.jar:db/titan/lib/jersey-client-1.4.jar:db/titan/lib/jersey-core-1.4.jar:db/titan/lib/jsr311-api-0.9.jar:db/titan/lib/jsr311-api-1.1.1.jar:db/titan/lib/server-api-1.6.1.jar:lib/log4j-1.2.16.jar com.yahoo.ycsb.Client -load -threads 12 -db org.xgdbench.TitanClient -P workloads/workloada -p fieldcount=4 -p affinitymatrix=[0.99f,0.53f,0.53f,0.13f] -p pthreshold=0.4 -p uri=http://st08:8182 -p randseed=100 -p genthreads=12
