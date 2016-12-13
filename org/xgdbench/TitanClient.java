package org.xgdbench;


@x10.runtime.impl.java.X10Generated public class TitanClient extends com.yahoo.ycsb.DB implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<TitanClient> $RTT = x10.rtt.NamedType.<TitanClient> make(
    "org.xgdbench.TitanClient", /* base class */TitanClient.class
    , /* parents */ new x10.rtt.Type[] {com.yahoo.ycsb.DB.$RTT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.TitanClient $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + TitanClient.class + " calling"); } 
        com.yahoo.ycsb.DB.$_deserialize_body($_obj, $deserializer);
        $_obj.SERVER_ROOT_URI = $deserializer.readRef();
        $_obj.transactInsert = $deserializer.readBoolean();
        $_obj.inOutNeighbourCount = $deserializer.readRef();
        $_obj.vertexAttribs = $deserializer.readRef();
        $_obj.newVertexQueue = $deserializer.readRef();
        $_obj.sumDegree = $deserializer.readLong();
        $_obj.largestVert = $deserializer.readLong();
        $_obj.largestNewVert = $deserializer.readLong();
        $_obj.totalOpCount = $deserializer.readLong();
        $_obj.transactInsertOpCount = $deserializer.readLong();
        $_obj.affMatrix = $deserializer.readRef();
        $_obj.mag = $deserializer.readRef();
        $_obj.thetaThreshold = $deserializer.readFloat();
        $_obj.attribCount = $deserializer.readInt();
        $_obj.threadCount = $deserializer.readInt();
        $_obj.insertProportion = $deserializer.readFloat();
        $_obj.indexName = $deserializer.readRef();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        TitanClient $_obj = new TitanClient((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        super.$_serialize($serializer);
        $serializer.write(this.SERVER_ROOT_URI);
        $serializer.write(this.transactInsert);
        if (inOutNeighbourCount instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.inOutNeighbourCount);
        } else {
        $serializer.write(this.inOutNeighbourCount);
        }
        if (vertexAttribs instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.vertexAttribs);
        } else {
        $serializer.write(this.vertexAttribs);
        }
        if (newVertexQueue instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.newVertexQueue);
        } else {
        $serializer.write(this.newVertexQueue);
        }
        $serializer.write(this.sumDegree);
        $serializer.write(this.largestVert);
        $serializer.write(this.largestNewVert);
        $serializer.write(this.totalOpCount);
        $serializer.write(this.transactInsertOpCount);
        if (affMatrix instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.affMatrix);
        } else {
        $serializer.write(this.affMatrix);
        }
        if (mag instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.mag);
        } else {
        $serializer.write(this.mag);
        }
        $serializer.write(this.thetaThreshold);
        $serializer.write(this.attribCount);
        $serializer.write(this.threadCount);
        $serializer.write(this.insertProportion);
        $serializer.write(this.indexName);
        
    }
    
    // constructor just for allocation
    public TitanClient(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public java.lang.String SERVER_ROOT_URI;
        
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public boolean transactInsert;
        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public x10.util.HashMap<x10.core.Int, x10.core.Int> inOutNeighbourCount;
        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>> vertexAttribs;
        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public x10.util.ArrayList<org.xgdbench.generator.Vertex> newVertexQueue;
        
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public long sumDegree;
        
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public long largestVert;
        
//#line 61 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public long largestNewVert;
        
//#line 62 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public long totalOpCount;
        
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public long transactInsertOpCount;
        
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public x10.array.Array<x10.core.Float> affMatrix;
        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public org.xgdbench.generator.MAGIncremental mag;
        
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String AFFINITY_MATRIX_DEFAULT = "[0.99f, 0.53f, 0.53f, 0.13f]";
        
//#line 67 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String AFFINITY_MATRIX = "affinitymatrix";
        
//#line 68 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String THETA_THRESHOLD_DEFAULT = "0.1";
        
//#line 69 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String THETA_THRESHOLD = "pthreshold";
        
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String RECORD_COUNT_PROPERTY_DEFAULT = "4";
        
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String RECORD_COUNT_PROPERTY = "fieldcount";
        
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String INSERT_PROPORTION_PROPERTY = "insertproportion";
        
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String INSERT_PROPORTION_PROPERTY_DEFAULT = "0.0";
        
//#line 74 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String TOTAL_OP_COUNT_PROPERTY_DEFAULT = "1000";
        
//#line 75 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String TOTAL_OP_COUNT_PROPERTY = "operationcount";
        
//#line 76 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String THREAD_COUNT_PROPERTY = "genthread";
        
//#line 77 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public static java.lang.String THREAD_COUNT_PROPERTY_DEFAULT = "4";
        
//#line 79 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public float thetaThreshold;
        
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int attribCount;
        
//#line 81 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int threadCount;
        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public float insertProportion;
        
//#line 83 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public java.lang.String indexName;
        
        
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
// creation method for java code (1-phase java constructor)
        public TitanClient(){this((java.lang.System[]) null);
                                 org$xgdbench$TitanClient$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.TitanClient org$xgdbench$TitanClient$$init$S() { {
                                                                                          
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
/*super.*/com$yahoo$ycsb$DB$$init$S();
                                                                                          
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"

                                                                                          
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.__fieldInitializers17791();
                                                                                      }
                                                                                      return this;
                                                                                      }
        
        
        
//#line 90 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public void
                                                                                                            init(
                                                                                                            ){
            
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21051 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21051.println(((java.lang.Object)("Creating a single MAG GRAPH. This should be the only graph to be loaded.")));
            
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.util.Properties props =
              this.getProperties();
            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21052 =
              props;
            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21053 =
              t21052.getProperty(((java.lang.String)("transactioninsert")));
            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21054 =
              java.lang.Boolean.parseBoolean(t21053);
            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.transactInsert = t21054;
            
//#line 94 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21055 =
              props;
            
//#line 94 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21056 =
              t21055.getProperty(((java.lang.String)("uri")));
            
//#line 94 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.SERVER_ROOT_URI = ((java.lang.String)(t21056));
            
//#line 95 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21057 =
              this.isServerRunning$O();
            
//#line 95 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21059 =
              !(t21057);
            
//#line 95 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21059) {
                
//#line 96 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21058 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 96 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21058.println(((java.lang.Object)("Rexster server is not running...")));
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return;
            }
            
//#line 100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21066 =
              transactInsert;
            
//#line 100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21066) {
                
//#line 101 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.loadVertexAttribs();
                
//#line 102 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.loadAffinityMatrix();
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t21060 =
                  ((x10.array.Array)(affMatrix));
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21061 =
                  ((x10.util.HashMap)(vertexAttribs));
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float t21062 =
                  thetaThreshold;
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21063 =
                  attribCount;
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.MAGIncremental t21064 =
                  ((org.xgdbench.generator.MAGIncremental)(new org.xgdbench.generator.MAGIncremental((java.lang.System[]) null).org$xgdbench$generator$MAGIncremental$$init$S(t21060,
                                                                                                                                                                              t21061,
                                                                                                                                                                              t21062,
                                                                                                                                                                              t21063, (org.xgdbench.generator.MAGIncremental.__0$1x10$lang$Float$2__1$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2) null)));
                
//#line 103 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.mag = ((org.xgdbench.generator.MAGIncremental)(t21064));
                
//#line 104 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t21065 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<org.xgdbench.generator.Vertex>((java.lang.System[]) null, org.xgdbench.generator.Vertex.$RTT).x10$util$ArrayList$$init$S()));
                
//#line 104 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.newVertexQueue = ((x10.util.ArrayList)(t21065));
                
//#line 105 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.constructInsertData();
            }
            
//#line 109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21067 =
              ((java.lang.String)(indexName));
            
//#line 109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21068 =
              this.createVertexIndex$O(((java.lang.String)(t21067)));
            
//#line 109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21071 =
              !(t21068);
            
//#line 109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21071) {
                
//#line 110 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21069 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 110 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21069.println(((java.lang.Object)("Index was not created. Probably it exists.")));
            } else {
                
//#line 112 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21070 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 112 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21070.println(((java.lang.Object)("Index created successfully.")));
            }
            
//#line 114 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21072 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 114 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21072.println(((java.lang.Object)("------7")));
        }
        
        
//#line 117 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private void
                                                                                                             loadAffinityMatrix(
                                                                                                             ){
            
//#line 118 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.util.Properties props =
              this.getProperties();
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21073 =
              props;
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21074 =
              ((java.lang.String)(org.xgdbench.TitanClient.AFFINITY_MATRIX));
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21075 =
              ((java.lang.String)(org.xgdbench.TitanClient.AFFINITY_MATRIX_DEFAULT));
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String aff =
              t21073.getProperty(((java.lang.String)(t21074)),
                                 ((java.lang.String)(t21075)));
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21078 =
              aff;
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21076 =
              aff;
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21077 =
              (t21076).length();
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21079 =
              ((t21077) - (((int)(1))));
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21080 =
              (t21078).substring(((int)(1)), ((int)(t21079)));
            
//#line 121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
aff = t21080;
            
//#line 122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21081 =
              aff;
            
//#line 122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array iterm =
              x10.lang.StringHelper.split(",", t21081);
            
//#line 124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t21082 =
              iterm;
            
//#line 124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21083 =
              ((x10.array.Array<java.lang.String>)t21082).
                size;
            
//#line 124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t21084 =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).x10$array$Array$$init$S(t21083)));
            
//#line 124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.affMatrix = ((x10.array.Array)(t21084));
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20208min22577 =
              0;
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22578 =
              iterm;
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22579 =
              ((x10.array.Array<java.lang.String>)t22578).
                size;
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20208max22580 =
              ((t22579) - (((int)(1))));
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i22574 =
              i20208min22577;
            
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22575 =
                  i22574;
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22576 =
                  ((t22575) <= (((int)(i20208max22580))));
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t22576)) {
                    
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i22571 =
                  i22574;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22562 =
                  ((x10.array.Array)(affMatrix));
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22563 =
                  i22571;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22564 =
                  ((x10.array.Array)(iterm));
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22565 =
                  i22571;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22566 =
                   null;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22545 =
                  p$22564;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22546 =
                  p$22565;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22547 =
                  ((x10.array.Array<java.lang.String>)x$22545).
                    rank;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22548 =
                  ((int) t22547) ==
                ((int) 1);
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22549 =
                  !(t22548);
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22549) {
                    
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22550 =
                      true;
                    
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22550) {
                        
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22551 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22551;
                    }
                }
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22552 =
                  ((x10.array.Array<java.lang.String>)x$22545).$apply$G((int)(x$i22546));
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22566 = t22552;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22567 =
                  ret22566;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22568 =
                  (t22567).trim();
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float p$22569 =
                  java.lang.Float.parseFloat(t22568);
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
float ret22570 =
                   0;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22553 =
                  p$22562;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22554 =
                  p$22563;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float x$v22555 =
                  p$22569;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22556 =
                  ((x10.array.Array<x10.core.Float>)x$22553).
                    rank;
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22557 =
                  ((int) t22556) ==
                ((int) 1);
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22558 =
                  !(t22557);
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22558) {
                    
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22559 =
                      true;
                    
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22559) {
                        
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22560 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22560;
                    }
                }
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float t22561 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$22553).$set__1x10$array$Array$$T$G((int)(x$i22554),
                                                                                                               x10.core.Float.$box(x$v22555)));
                
//#line 127 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22570 = t22561;
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22572 =
                  i22574;
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22573 =
                  ((t22572) + (((int)(1))));
                
//#line 126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i22574 = t22573;
            }
            
//#line 130 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21106 =
              props;
            
//#line 130 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21107 =
              ((java.lang.String)(org.xgdbench.TitanClient.THETA_THRESHOLD));
            
//#line 130 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21108 =
              ((java.lang.String)(org.xgdbench.TitanClient.THETA_THRESHOLD_DEFAULT));
            
//#line 130 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String thetaThreash =
              t21106.getProperty(((java.lang.String)(t21107)),
                                 ((java.lang.String)(t21108)));
            
//#line 131 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21109 =
              thetaThreash;
            
//#line 131 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float t21110 =
              java.lang.Float.parseFloat(t21109);
            
//#line 131 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.thetaThreshold = t21110;
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21111 =
              props;
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21112 =
              ((java.lang.String)(org.xgdbench.TitanClient.RECORD_COUNT_PROPERTY));
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21113 =
              ((java.lang.String)(org.xgdbench.TitanClient.RECORD_COUNT_PROPERTY_DEFAULT));
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21114 =
              t21111.getProperty(((java.lang.String)(t21112)),
                                 ((java.lang.String)(t21113)));
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21115 =
              java.lang.Integer.parseInt(t21114);
            
//#line 133 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.attribCount = t21115;
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21116 =
              props;
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21117 =
              ((java.lang.String)(org.xgdbench.TitanClient.INSERT_PROPORTION_PROPERTY));
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21118 =
              ((java.lang.String)(org.xgdbench.TitanClient.INSERT_PROPORTION_PROPERTY_DEFAULT));
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21119 =
              t21116.getProperty(((java.lang.String)(t21117)),
                                 ((java.lang.String)(t21118)));
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float t21120 =
              java.lang.Float.parseFloat(t21119);
            
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.insertProportion = t21120;
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21121 =
              props;
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21122 =
              ((java.lang.String)(org.xgdbench.TitanClient.TOTAL_OP_COUNT_PROPERTY));
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21123 =
              ((java.lang.String)(org.xgdbench.TitanClient.TOTAL_OP_COUNT_PROPERTY_DEFAULT));
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21124 =
              t21121.getProperty(((java.lang.String)(t21122)),
                                 ((java.lang.String)(t21123)));
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21125 =
              java.lang.Long.parseLong(t21124);
            
//#line 136 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.totalOpCount = t21125;
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Properties t21126 =
              props;
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21127 =
              ((java.lang.String)(org.xgdbench.TitanClient.THREAD_COUNT_PROPERTY));
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21128 =
              ((java.lang.String)(org.xgdbench.TitanClient.THREAD_COUNT_PROPERTY_DEFAULT));
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21129 =
              t21126.getProperty(((java.lang.String)(t21127)),
                                 ((java.lang.String)(t21128)));
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21130 =
              java.lang.Integer.parseInt(t21129);
            
//#line 137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.threadCount = t21130;
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final float t21131 =
              insertProportion;
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21137 =
              ((double)(float)(((float)(t21131))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21133 =
              totalOpCount;
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21132 =
              threadCount;
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21134 =
              ((long)(((int)(t21132))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21135 =
              ((t21133) / (((long)(t21134))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21136 =
              ((double)(long)(((long)(t21135))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21138 =
              java.lang.Math.round(((double)(t21136)));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21139 =
              ((t21137) * (((double)(t21138))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21140 =
              ((double)(int)(((int)(10))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final double t21141 =
              ((t21139) + (((double)(t21140))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21142 =
              ((long)(double)(((double)(t21141))));
            
//#line 139 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.transactInsertOpCount = t21142;
            
//#line 141 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21144 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 141 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21143 =
              transactInsertOpCount;
            
//#line 141 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21145 =
              (("transactInsertOpCount : ") + ((x10.core.Long.$box(t21143))));
            
//#line 141 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21144.println(((java.lang.Object)(t21145)));
        }
        
        public static void
          loadAffinityMatrix$P(
          final org.xgdbench.TitanClient TitanClient){
            TitanClient.loadAffinityMatrix();
        }
        
        
//#line 147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public void
                                                                                                             loadVertexAttribs(
                                                                                                             ){
            
//#line 148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21146 =
              ((x10.util.HashMap)(new x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>>((java.lang.System[]) null, x10.rtt.Types.INT, x10.rtt.ParameterizedType.make(x10.array.Array.$RTT, x10.rtt.Types.INT)).x10$util$HashMap$$init$S()));
            
//#line 148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.vertexAttribs = ((x10.util.HashMap)(t21146));
            
//#line 150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21147 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21147) + ("/graphs/graph/vertices"));
            
//#line 152 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21148 =
              com.sun.jersey.api.client.Client.create();
            
//#line 152 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21148.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 157 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21149 =
              resp;
            
//#line 157 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.InputStream entityStream =
              t21149.getEntityInputStream();
            
//#line 159 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t21150 =
              entityStream;
            
//#line 159 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStreamReader t21151 =
              ((java.io.InputStreamReader)(new java.io.InputStreamReader(t21150)));
            
//#line 159 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.BufferedReader reader =
              new java.io.BufferedReader(((java.io.Reader)(t21151)));
            
//#line 160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.StringBuilder builder =
              new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
            
//#line 161 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String line =
              null;
            
//#line 163 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ch =
              -1;
            
//#line 164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean appendFlag =
              false;
            
//#line 165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean withinEntityFlag =
              false;
            
//#line 167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                    
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.BufferedReader t21152 =
                      reader;
                    
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21153 =
                      t21152.read();
                    
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21154 =
                      ch = t21153;
                    
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21277 =
                      ((int) t21154) !=
                    ((int) -1);
                    
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t21277)) {
                        
//#line 168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                    }
                    
//#line 169 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22715 =
                      ch;
                    
//#line 169 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22716 =
                      ((int) t22715) ==
                    ((int) 91);
                    
//#line 169 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22716) {
                        
//#line 170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag = true;
                        
//#line 171 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                    }
                    
//#line 174 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22717 =
                      ch;
                    
//#line 174 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22718 =
                      ((int) t22717) ==
                    ((int) 93);
                    
//#line 174 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22718) {
                        
//#line 175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag = false;
                    }
                    
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t22719 =
                      appendFlag;
                    
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22719) {
                        
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22720 =
                          ch;
                        
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22719 = ((int) t22720) ==
                        ((int) 123);
                    }
                    
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22721 =
                      t22719;
                    
//#line 178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22721) {
                        
//#line 179 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag = true;
                        
//#line 180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t22722 =
                          ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
                        
//#line 180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
builder = t22722;
                        
//#line 181 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                    }
                    
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t22723 =
                      appendFlag;
                    
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22723) {
                        
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22724 =
                          ch;
                        
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22723 = ((int) t22724) ==
                        ((int) 125);
                    }
                    
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22725 =
                      t22723;
                    
//#line 184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22725) {
                        
//#line 185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag = false;
                        
//#line 186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t22726 =
                          builder;
                        
//#line 186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String entity22727 =
                          t22726.toString();
                        
//#line 188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22728 =
                          entity22727;
                        
//#line 188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array kvs22729 =
                          x10.lang.StringHelper.split(",", t22728);
                        
//#line 189 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int counter22730 =
                          0;
                        
//#line 190 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22731 =
                          kvs22729;
                        
//#line 190 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int len22732 =
                          ((x10.array.Array<java.lang.String>)t22731).
                            size;
                        
//#line 191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int perName22733 =
                          -1;
                        
//#line 192 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.ArrayList attribArrayList22734 =
                          new x10.util.ArrayList<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$util$ArrayList$$init$S();
                        
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20224min22712 =
                          0;
                        
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22713 =
                          len22732;
                        
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20224max22714 =
                          ((t22713) - (((int)(1))));
                        
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i22692 =
                          i20224min22712;
                        
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22693 =
                              i22692;
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22694 =
                              ((t22693) <= (((int)(i20224max22714))));
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t22694)) {
                                
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                            }
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int counter22689 =
                              i22692;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22642 =
                              ((x10.array.Array)(kvs22729));
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22643 =
                              counter22689;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22644 =
                               null;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22626 =
                              p$22642;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22627 =
                              p$22643;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22628 =
                              ((x10.array.Array<java.lang.String>)x$22626).
                                rank;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22629 =
                              ((int) t22628) ==
                            ((int) 1);
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22630 =
                              !(t22629);
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22630) {
                                
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22631 =
                                  true;
                                
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22631) {
                                    
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22632 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22632;
                                }
                            }
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22633 =
                              ((x10.array.Array<java.lang.String>)x$22626).$apply$G((int)(x$i22627));
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22644 = t22633;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22645 =
                              ret22644;
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22646 =
                              (t22645).indexOf("name");
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22647 =
                              ((int) t22646) !=
                            ((int) -1);
                            
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22647) {
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22648 =
                                  ((x10.array.Array)(kvs22729));
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22649 =
                                  counter22689;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22650 =
                                   null;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22581 =
                                  p$22648;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22582 =
                                  p$22649;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22583 =
                                  ((x10.array.Array<java.lang.String>)x$22581).
                                    rank;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22584 =
                                  ((int) t22583) ==
                                ((int) 1);
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22585 =
                                  !(t22584);
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22585) {
                                    
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22586 =
                                      true;
                                    
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22586) {
                                        
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22587 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22587;
                                    }
                                }
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22588 =
                                  ((x10.array.Array<java.lang.String>)x$22581).$apply$G((int)(x$i22582));
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22650 = t22588;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22651 =
                                  ret22650;
                                
//#line 196 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr22652 =
                                  x10.lang.StringHelper.split(":", t22651);
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22653 =
                                  ((x10.array.Array)(strArr22652));
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22654 =
                                   null;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22589 =
                                  p$22653;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22590 =
                                  ((x10.array.Array<java.lang.String>)x$22589).
                                    rank;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22591 =
                                  ((int) t22590) ==
                                ((int) 1);
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22592 =
                                  !(t22591);
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22592) {
                                    
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22593 =
                                      true;
                                    
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22593) {
                                        
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22594 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22594;
                                    }
                                }
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22595 =
                                  ((x10.array.Array<java.lang.String>)x$22589).$apply$G((int)(1));
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22654 = t22595;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22655 =
                                  ret22654;
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22656 =
                                  this.removeQuotes(((java.lang.String)(t22655)));
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22657 =
                                  java.lang.Integer.parseInt(t22656);
                                
//#line 197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
perName22733 = t22657;
                            }
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22658 =
                              ((x10.array.Array)(kvs22729));
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22659 =
                              counter22689;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22660 =
                               null;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22634 =
                              p$22658;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22635 =
                              p$22659;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22636 =
                              ((x10.array.Array<java.lang.String>)x$22634).
                                rank;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22637 =
                              ((int) t22636) ==
                            ((int) 1);
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22638 =
                              !(t22637);
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22638) {
                                
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22639 =
                                  true;
                                
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22639) {
                                    
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22640 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22640;
                                }
                            }
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22641 =
                              ((x10.array.Array<java.lang.String>)x$22634).$apply$G((int)(x$i22635));
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22660 = t22641;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22661 =
                              ret22660;
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22662 =
                              (t22661).indexOf("attrib");
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22663 =
                              ((int) t22662) !=
                            ((int) -1);
                            
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22663) {
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22664 =
                                  ((x10.array.Array)(kvs22729));
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22665 =
                                  counter22689;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22666 =
                                   null;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22618 =
                                  p$22664;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22619 =
                                  p$22665;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22620 =
                                  ((x10.array.Array<java.lang.String>)x$22618).
                                    rank;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22621 =
                                  ((int) t22620) ==
                                ((int) 1);
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22622 =
                                  !(t22621);
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22622) {
                                    
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22623 =
                                      true;
                                    
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22623) {
                                        
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22624 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22624;
                                    }
                                }
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22625 =
                                  ((x10.array.Array<java.lang.String>)x$22618).$apply$G((int)(x$i22619));
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22666 = t22625;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22667 =
                                  ret22666;
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22668 =
                                  (t22667).indexOf("attrib");
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22669 =
                                  ((int) t22668) !=
                                ((int) -1);
                                
//#line 201 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22669) {
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22670 =
                                      ((x10.array.Array)(kvs22729));
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22671 =
                                      counter22689;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22672 =
                                       null;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22596 =
                                      p$22670;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22597 =
                                      p$22671;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22598 =
                                      ((x10.array.Array<java.lang.String>)x$22596).
                                        rank;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22599 =
                                      ((int) t22598) ==
                                    ((int) 1);
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22600 =
                                      !(t22599);
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22600) {
                                        
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22601 =
                                          true;
                                        
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22601) {
                                            
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22602 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22602;
                                        }
                                    }
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22603 =
                                      ((x10.array.Array<java.lang.String>)x$22596).$apply$G((int)(x$i22597));
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22672 = t22603;
                                    
//#line 202 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value22673 =
                                      ret22672;
                                    
//#line 203 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22674 =
                                      value22673;
                                    
//#line 203 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr22675 =
                                      x10.lang.StringHelper.split(":", t22674);
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22676 =
                                      ((x10.array.Array)(strArr22675));
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22677 =
                                       null;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22604 =
                                      p$22676;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22605 =
                                      ((x10.array.Array<java.lang.String>)x$22604).
                                        rank;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22606 =
                                      ((int) t22605) ==
                                    ((int) 1);
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22607 =
                                      !(t22606);
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22607) {
                                        
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22608 =
                                          true;
                                        
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22608) {
                                            
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22609 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22609;
                                        }
                                    }
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22610 =
                                      ((x10.array.Array<java.lang.String>)x$22604).$apply$G((int)(0));
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22677 = t22610;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22678 =
                                      ret22677;
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22679 =
                                      ((x10.array.Array)(x10.lang.StringHelper.split("attrib", t22678)));
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22680 =
                                      ((x10.array.Array<java.lang.String>)t22679).$apply$G((int)(1));
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22681 =
                                      this.removeQuotes(((java.lang.String)(t22680)));
                                    
//#line 204 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int r22682 =
                                      java.lang.Integer.parseInt(t22681);
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22683 =
                                      attribArrayList22734;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22684 =
                                      ((x10.array.Array)(strArr22675));
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22685 =
                                       null;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22611 =
                                      p$22684;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22612 =
                                      ((x10.array.Array<java.lang.String>)x$22611).
                                        rank;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22613 =
                                      ((int) t22612) ==
                                    ((int) 1);
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22614 =
                                      !(t22613);
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22614) {
                                        
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22615 =
                                          true;
                                        
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22615) {
                                            
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22616 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22616;
                                        }
                                    }
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22617 =
                                      ((x10.array.Array<java.lang.String>)x$22611).$apply$G((int)(1));
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22685 = t22617;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22686 =
                                      ret22685;
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22687 =
                                      this.removeQuotes(((java.lang.String)(t22686)));
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22688 =
                                      java.lang.Integer.parseInt(t22687);
                                    
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<x10.core.Int>)t22683).add__0x10$util$ArrayList$$T$O(x10.core.Int.$box(t22688));
                                }
                            }
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22690 =
                              i22692;
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22691 =
                              ((t22690) + (((int)(1))));
                            
//#line 194 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i22692 = t22691;
                        }
                        
//#line 210 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22735 =
                          perName22733;
                        
//#line 210 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22736 =
                          ((int) t22735) !=
                        ((int) -1);
                        
//#line 210 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22736) {
                            
//#line 211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22737 =
                              attribArrayList22734;
                            
//#line 211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22738 =
                              ((x10.util.ArrayList<x10.core.Int>)t22737).size$O();
                            
//#line 211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array v22739 =
                              new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array$$init$S(t22738);
                            
//#line 213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22740 =
                              attribArrayList22734;
                            
//#line 213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ListIterator t22741 =
                              ((x10.util.ListIterator<x10.core.Int>)
                                ((x10.util.ArrayList<x10.core.Int>)t22740).iterator());
                            
//#line 213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.lang.Iterator itr22742 =
                              ((x10.lang.Iterator<x10.core.Int>)
                                t22741);
                            
//#line 214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int cntr22743 =
                              0;
                            
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                                
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t22744 =
                                  itr22742;
                                
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22745 =
                                  ((x10.lang.Iterator<x10.core.Int>)t22744).hasNext$O();
                                
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t22745)) {
                                    
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                                }
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22704 =
                                  ((x10.array.Array)(v22739));
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22705 =
                                  cntr22743;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t22706 =
                                  itr22742;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22707 =
                                  x10.core.Int.$unbox(((x10.lang.Iterator<x10.core.Int>)t22706).next$G());
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22708 =
                                  t22707;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret22709 =
                                   0;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22695 =
                                  p$22704;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22696 =
                                  p$22705;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$v22697 =
                                  p$22708;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22698 =
                                  ((x10.array.Array<x10.core.Int>)x$22695).
                                    rank;
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22699 =
                                  ((int) t22698) ==
                                ((int) 1);
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22700 =
                                  !(t22699);
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22700) {
                                    
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22701 =
                                      true;
                                    
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22701) {
                                        
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22702 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22702;
                                    }
                                }
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22703 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$22695).$set__1x10$array$Array$$T$G((int)(x$i22696),
                                                                                                                           x10.core.Int.$box(x$v22697)));
                                
//#line 216 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22709 = t22703;
                                
//#line 217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22710 =
                                  cntr22743;
                                
//#line 217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22711 =
                                  ((t22710) + (((int)(1))));
                                
//#line 217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
cntr22743 = t22711;
                            }
                            
//#line 220 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22746 =
                              ((x10.util.HashMap)(vertexAttribs));
                            
//#line 220 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22747 =
                              perName22733;
                            
//#line 220 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22748 =
                              v22739;
                            
//#line 220 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>>)t22746).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(x10.core.Int.$box(t22747),
                                                                                                                                                                                                                                                       ((x10.array.Array)(t22748)));
                            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22749 =
                              perName22733;
                            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22750 =
                              ((long)(((int)(t22749))));
                            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22751 =
                              largestVert;
                            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22752 =
                              ((t22750) > (((long)(t22751))));
                            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22752) {
                                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22753 =
                                  perName22733;
                                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22754 =
                                  ((long)(((int)(t22753))));
                                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.largestVert = t22754;
                            }
                        }
                    }
                    
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t22755 =
                      appendFlag;
                    
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22755) {
                        
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22755 = withinEntityFlag;
                    }
                    
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22756 =
                      t22755;
                    
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22756) {
                        
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t22757 =
                          builder;
                        
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22758 =
                          ch;
                        
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final char t22759 =
                          ((char) (((int)(t22758))));
                        
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22757.add((char)(t22759));
                    }
                }
            }}catch (java.io.IOException e) {
                
//#line 234 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t21278 =
                  e;
                
//#line 234 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21278.printStackTrace();
            }finally {{
                 
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                     
//#line 237 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t21279 =
                       entityStream;
                     
//#line 237 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21279.close();
                 }}catch (java.io.IOException ec) {
                     
//#line 239 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t21280 =
                       ec;
                     
//#line 239 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21280.printStackTrace();
                 }
             }}
            
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21281 =
              largestVert;
            
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.largestNewVert = t21281;
            }
        
        
//#line 246 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private void
                                                                                                             constructInsertData(
                                                                                                             ){
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long i20240min20241 =
              ((long)(((int)(0))));
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21282 =
              transactInsertOpCount;
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21283 =
              ((long)(((int)(1))));
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long i20240max20242 =
              ((t21282) - (((long)(t21283))));
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
long i22778 =
              i20240min20241;
            
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22779 =
                  i22778;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22780 =
                  ((t22779) <= (((long)(i20240max20242))));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t22780)) {
                    
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long i22775 =
                  i22778;
                
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.TitanClient x22760 =
                  ((org.xgdbench.TitanClient)(this));
                
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22761 =
                  x22760.
                    largestNewVert;
                
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22762 =
                  ((t22761) + (((long)(1L))));
                
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x22760.largestNewVert = t22762;
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.MAGIncremental t22763 =
                  ((org.xgdbench.generator.MAGIncremental)(mag));
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22764 =
                  largestNewVert;
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
org.xgdbench.generator.Vertex c22765 =
                  t22763.getListOfVerticesToConnectWith((long)(t22764));
                
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22766 =
                  ((x10.util.ArrayList)(newVertexQueue));
                
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t22767 =
                  c22765;
                
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<org.xgdbench.generator.Vertex>)t22766).add__0x10$util$ArrayList$$T$O(((org.xgdbench.generator.Vertex)(t22767)));
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22768 =
                  ((x10.util.HashMap)(vertexAttribs));
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22769 =
                  largestNewVert;
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22770 =
                  ((int)(long)(((long)(t22769))));
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t22771 =
                  c22765;
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22772 =
                  ((x10.array.Array)(t22771.
                                       attribs));
                
//#line 251 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>>)t22768).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(x10.core.Int.$box(t22770),
                                                                                                                                                                                                                                           ((x10.array.Array)(t22772)));
                
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.MAGIncremental t22773 =
                  ((org.xgdbench.generator.MAGIncremental)(mag));
                
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22774 =
                  ((x10.util.HashMap)(vertexAttribs));
                
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22773.setVerticesAndAttributes__0$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2(((x10.util.HashMap)(t22774)));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22776 =
                  i22778;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t22777 =
                  ((t22776) + (((long)(1L))));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i22778 = t22777;
            }
        }
        
        public static void
          constructInsertData$P(
          final org.xgdbench.TitanClient TitanClient){
            TitanClient.constructInsertData();
        }
        
        
//#line 260 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public boolean
                                                                                                             isServerRunning$O(
                                                                                                             ){
            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean result =
              false;
            
//#line 263 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21302 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 263 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21302) + ("/graphs"));
            
//#line 265 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21303 =
              com.sun.jersey.api.client.Client.create();
            
//#line 265 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21303.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                
//#line 268 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
                  null;
                
//#line 269 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = true;
            }}catch (java.lang.RuntimeException e) {
                
//#line 271 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = false;
            }
            
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21304 =
              result;
            
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21304;
        }
        
        
//#line 282 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                             read__2$1x10$lang$String$2__3$1x10$lang$String$3x10$lang$String$2$O(
                                                                                                             java.lang.String table,
                                                                                                             java.lang.String key,
                                                                                                             x10.util.Set fields,
                                                                                                             x10.util.HashMap result){
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21305 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21305) + ("/graphs/graph/tp/gremlin"));
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21306 =
              com.sun.jersey.api.client.Client.create();
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21306.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 296 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String entity =
              null;
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21307 =
              entity;
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21308 =
              (t21307).lastIndexOf("{");
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int firstIndex =
              ((t21308) + (((int)(1))));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21309 =
              entity;
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21310 =
              firstIndex;
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21311 =
              (t21309).substring(((int)(t21310)));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21312 =
              (t21311).trim();
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
entity = t21312;
            
//#line 300 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21313 =
              entity;
            
//#line 300 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int lastIndex =
              (t21313).indexOf("}");
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21314 =
              entity;
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21315 =
              lastIndex;
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21316 =
              (t21314).substring(((int)(0)), ((int)(t21315)));
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21317 =
              (t21316).trim();
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
entity = t21317;
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21318 =
              entity;
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array kvs =
              x10.lang.StringHelper.split(",", t21318);
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int counter =
              0;
            
//#line 305 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t21319 =
              kvs;
            
//#line 305 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int len =
              ((x10.array.Array<java.lang.String>)t21319).
                size;
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int startInd =
              -1;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20256min22917 =
              0;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22918 =
              len;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20256max22919 =
              ((t22918) - (((int)(1))));
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i22914 =
              i20256min22917;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22915 =
                  i22914;
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22916 =
                  ((t22915) <= (((int)(i20256max22919))));
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t22916)) {
                    
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int counter22911 =
                  i22914;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22857 =
                  ((x10.array.Array)(kvs));
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22858 =
                  counter22911;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22859 =
                   null;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22833 =
                  p$22857;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22834 =
                  p$22858;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22835 =
                  ((x10.array.Array<java.lang.String>)x$22833).
                    rank;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22836 =
                  ((int) t22835) ==
                ((int) 1);
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22837 =
                  !(t22836);
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22837) {
                    
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22838 =
                      true;
                    
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22838) {
                        
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22839 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22839;
                    }
                }
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22840 =
                  ((x10.array.Array<java.lang.String>)x$22833).$apply$G((int)(x$i22834));
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22859 = t22840;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22860 =
                  ret22859;
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22861 =
                  (t22860).indexOf("name");
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22862 =
                  ((int) t22861) !=
                ((int) -1);
                
//#line 309 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22862) {
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22863 =
                      ((x10.array.Array)(kvs));
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22864 =
                      counter22911;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22865 =
                       null;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22781 =
                      p$22863;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22782 =
                      p$22864;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22783 =
                      ((x10.array.Array<java.lang.String>)x$22781).
                        rank;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22784 =
                      ((int) t22783) ==
                    ((int) 1);
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22785 =
                      !(t22784);
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22785) {
                        
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22786 =
                          true;
                        
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22786) {
                            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22787 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22787;
                        }
                    }
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22788 =
                      ((x10.array.Array<java.lang.String>)x$22781).$apply$G((int)(x$i22782));
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22865 = t22788;
                    
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String value22866 =
                      ret22865;
                    
//#line 311 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22867 =
                      (value22866).indexOf(":");
                    
//#line 311 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22868 =
                      ((t22867) + (((int)(1))));
                    
//#line 311 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
startInd = t22868;
                    
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22869 =
                      result;
                    
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22870 =
                      startInd;
                    
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22871 =
                      (value22866).substring(((int)(t22870)));
                    
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22872 =
                      this.removeQuotes(((java.lang.String)(t22871)));
                    
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t22869).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("name")),
                                                                                                                                                                                                                                      ((java.lang.String)(t22872)));
                }
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22873 =
                  ((x10.array.Array)(kvs));
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22874 =
                  counter22911;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22875 =
                   null;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22841 =
                  p$22873;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22842 =
                  p$22874;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22843 =
                  ((x10.array.Array<java.lang.String>)x$22841).
                    rank;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22844 =
                  ((int) t22843) ==
                ((int) 1);
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22845 =
                  !(t22844);
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22845) {
                    
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22846 =
                      true;
                    
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22846) {
                        
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22847 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22847;
                    }
                }
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22848 =
                  ((x10.array.Array<java.lang.String>)x$22841).$apply$G((int)(x$i22842));
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22875 = t22848;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22876 =
                  ret22875;
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22877 =
                  (t22876).indexOf("attrib");
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22878 =
                  ((int) t22877) !=
                ((int) -1);
                
//#line 315 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22878) {
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22879 =
                      ((x10.array.Array)(kvs));
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22880 =
                      counter22911;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22881 =
                       null;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22789 =
                      p$22879;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22790 =
                      p$22880;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22791 =
                      ((x10.array.Array<java.lang.String>)x$22789).
                        rank;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22792 =
                      ((int) t22791) ==
                    ((int) 1);
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22793 =
                      !(t22792);
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22793) {
                        
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22794 =
                          true;
                        
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22794) {
                            
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22795 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22795;
                        }
                    }
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22796 =
                      ((x10.array.Array<java.lang.String>)x$22789).$apply$G((int)(x$i22790));
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22881 = t22796;
                    
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value22882 =
                      ret22881;
                    
//#line 317 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22883 =
                      value22882;
                    
//#line 317 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr22884 =
                      x10.lang.StringHelper.split(":", t22883);
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22885 =
                      result;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22886 =
                      ((x10.array.Array)(strArr22884));
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22887 =
                       null;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22797 =
                      p$22886;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22798 =
                      ((x10.array.Array<java.lang.String>)x$22797).
                        rank;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22799 =
                      ((int) t22798) ==
                    ((int) 1);
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22800 =
                      !(t22799);
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22800) {
                        
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22801 =
                          true;
                        
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22801) {
                            
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22802 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22802;
                        }
                    }
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22803 =
                      ((x10.array.Array<java.lang.String>)x$22797).$apply$G((int)(0));
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22887 = t22803;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22888 =
                      ret22887;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22889 =
                      ((x10.array.Array)(strArr22884));
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22890 =
                       null;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22804 =
                      p$22889;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22805 =
                      ((x10.array.Array<java.lang.String>)x$22804).
                        rank;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22806 =
                      ((int) t22805) ==
                    ((int) 1);
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22807 =
                      !(t22806);
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22807) {
                        
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22808 =
                          true;
                        
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22808) {
                            
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22809 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22809;
                        }
                    }
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22810 =
                      ((x10.array.Array<java.lang.String>)x$22804).$apply$G((int)(1));
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22890 = t22810;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22891 =
                      ret22890;
                    
//#line 318 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t22885).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t22888)),
                                                                                                                                                                                                                                      ((java.lang.String)(t22891)));
                }
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22892 =
                  ((x10.array.Array)(kvs));
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22893 =
                  counter22911;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22894 =
                   null;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22849 =
                  p$22892;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22850 =
                  p$22893;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22851 =
                  ((x10.array.Array<java.lang.String>)x$22849).
                    rank;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22852 =
                  ((int) t22851) ==
                ((int) 1);
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22853 =
                  !(t22852);
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22853) {
                    
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22854 =
                      true;
                    
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22854) {
                        
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22855 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22855;
                    }
                }
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22856 =
                  ((x10.array.Array<java.lang.String>)x$22849).$apply$G((int)(x$i22850));
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22894 = t22856;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22895 =
                  ret22894;
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22896 =
                  (t22895).indexOf("LastLogin");
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22897 =
                  ((int) t22896) !=
                ((int) -1);
                
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22897) {
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22898 =
                      ((x10.array.Array)(kvs));
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22899 =
                      counter22911;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22900 =
                       null;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22811 =
                      p$22898;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22812 =
                      p$22899;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22813 =
                      ((x10.array.Array<java.lang.String>)x$22811).
                        rank;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22814 =
                      ((int) t22813) ==
                    ((int) 1);
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22815 =
                      !(t22814);
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22815) {
                        
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22816 =
                          true;
                        
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22816) {
                            
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22817 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22817;
                        }
                    }
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22818 =
                      ((x10.array.Array<java.lang.String>)x$22811).$apply$G((int)(x$i22812));
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22900 = t22818;
                    
//#line 322 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value22901 =
                      ret22900;
                    
//#line 323 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22902 =
                      value22901;
                    
//#line 323 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr22903 =
                      x10.lang.StringHelper.split(":", t22902);
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22904 =
                      result;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22905 =
                      ((x10.array.Array)(strArr22903));
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22906 =
                       null;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22819 =
                      p$22905;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22820 =
                      ((x10.array.Array<java.lang.String>)x$22819).
                        rank;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22821 =
                      ((int) t22820) ==
                    ((int) 1);
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22822 =
                      !(t22821);
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22822) {
                        
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22823 =
                          true;
                        
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22823) {
                            
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22824 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22824;
                        }
                    }
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22825 =
                      ((x10.array.Array<java.lang.String>)x$22819).$apply$G((int)(0));
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22906 = t22825;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22907 =
                      ret22906;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22908 =
                      ((x10.array.Array)(strArr22903));
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22909 =
                       null;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22826 =
                      p$22908;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22827 =
                      ((x10.array.Array<java.lang.String>)x$22826).
                        rank;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22828 =
                      ((int) t22827) ==
                    ((int) 1);
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22829 =
                      !(t22828);
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22829) {
                        
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22830 =
                          true;
                        
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22830) {
                            
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22831 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22831;
                        }
                    }
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22832 =
                      ((x10.array.Array<java.lang.String>)x$22826).$apply$G((int)(1));
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22909 = t22832;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22910 =
                      ret22909;
                    
//#line 324 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t22904).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t22907)),
                                                                                                                                                                                                                                      ((java.lang.String)(t22910)));
                }
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22912 =
                  i22914;
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22913 =
                  ((t22912) + (((int)(1))));
                
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i22914 = t22913;
            }
            
//#line 328 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21409 =
              resp;
            
//#line 328 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.net.URI location =
              t21409.getLocation();
            
//#line 330 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21410 =
              resp;
            
//#line 330 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21411 =
              t21410.getStatus();
            
//#line 330 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21423 =
              ((int) t21411) ==
            ((int) 500);
            
//#line 330 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21423) {
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21421 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21412 =
                  "Error : POST on ";
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21413 =
                  ((t21412) + (nodeEntryPoIntUri));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21415 =
                  ((t21413) + (", status code "));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21414 =
                  resp;
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21416 =
                  t21414.getStatus();
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21417 =
                  ((t21415) + ((x10.core.Int.$box(t21416))));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21418 =
                  ((t21417) + (", location header "));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21419 =
                  location.toString();
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21420 =
                  ((t21418) + (t21419));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21422 =
                  ((t21420) + (""));
                
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21421.println(((java.lang.Object)(t21422)));
            }
            
//#line 334 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21424 =
              resp;
            
//#line 334 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21424.close();
            
//#line 336 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 344 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                             scan__3$1x10$lang$String$2__4$1x10$util$HashMap$1x10$lang$String$3x10$lang$String$2$2$O(
                                                                                                             java.lang.String table,
                                                                                                             java.lang.String startkey,
                                                                                                             int recordcount,
                                                                                                             x10.util.Set fields,
                                                                                                             x10.util.ArrayList result){
            
//#line 346 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21425 =
              startkey;
            
//#line 346 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String fromVertID =
              this.getVertexID(((java.lang.String)(t21425)));
            
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21426 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21427 =
              ((t21426) + ("/graphs/graph/vertices/"));
            
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21428 =
              fromVertID;
            
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21429 =
              ((t21427) + (t21428));
            
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21429) + ("/bothE"));
            
//#line 349 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21430 =
              com.sun.jersey.api.client.Client.create();
            
//#line 349 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21430.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 352 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 354 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21431 =
              resp;
            
//#line 354 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.InputStream entityStream =
              t21431.getEntityInputStream();
            
//#line 356 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t21432 =
              entityStream;
            
//#line 356 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStreamReader t21433 =
              ((java.io.InputStreamReader)(new java.io.InputStreamReader(t21432)));
            
//#line 356 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.BufferedReader reader =
              new java.io.BufferedReader(((java.io.Reader)(t21433)));
            
//#line 357 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.StringBuilder builder =
              new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
            
//#line 358 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String line =
              null;
            
//#line 360 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ch =
              -1;
            
//#line 361 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean appendFlag =
              false;
            
//#line 362 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean withinEntityFlag =
              false;
            
//#line 363 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.ArrayList foundFriends =
              new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
            
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                    
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.BufferedReader t21434 =
                      reader;
                    
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21435 =
                      t21434.read();
                    
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21436 =
                      ch = t21435;
                    
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21522 =
                      ((int) t21436) !=
                    ((int) -1);
                    
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t21522)) {
                        
//#line 366 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                    }
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23014 =
                      ch;
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23015 =
                      ((int) t23014) ==
                    ((int) 91);
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23015) {
                        
//#line 368 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag = true;
                        
//#line 369 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                    }
                    
//#line 372 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23016 =
                      ch;
                    
//#line 372 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23017 =
                      ((int) t23016) ==
                    ((int) 93);
                    
//#line 372 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23017) {
                        
//#line 373 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag = false;
                    }
                    
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23018 =
                      appendFlag;
                    
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23018) {
                        
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23019 =
                          ch;
                        
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23018 = ((int) t23019) ==
                        ((int) 123);
                    }
                    
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23020 =
                      t23018;
                    
//#line 376 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23020) {
                        
//#line 377 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag = true;
                        
//#line 378 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23021 =
                          ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
                        
//#line 378 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
builder = t23021;
                        
//#line 379 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                    }
                    
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23022 =
                      appendFlag;
                    
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23022) {
                        
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23023 =
                          ch;
                        
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23022 = ((int) t23023) ==
                        ((int) 125);
                    }
                    
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23024 =
                      t23022;
                    
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23024) {
                        
//#line 383 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag = false;
                        
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23025 =
                          builder;
                        
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String entity23026 =
                          t23025.toString();
                        
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23027 =
                          entity23026;
                        
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array kvs23028 =
                          x10.lang.StringHelper.split(",", t23027);
                        
//#line 387 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int counter23029 =
                          0;
                        
//#line 388 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t23030 =
                          kvs23028;
                        
//#line 388 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int len23031 =
                          ((x10.array.Array<java.lang.String>)t23030).
                            size;
                        
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap hMap23032 =
                          new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                        
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20272min23011 =
                          0;
                        
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23012 =
                          len23031;
                        
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20272max23013 =
                          ((t23012) - (((int)(1))));
                        
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23008 =
                          i20272min23011;
                        
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23009 =
                              i23008;
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23010 =
                              ((t23009) <= (((int)(i20272max23013))));
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23010)) {
                                
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                            }
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int counter23005 =
                              i23008;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22971 =
                              ((x10.array.Array)(kvs23028));
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22972 =
                              counter23005;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22973 =
                               null;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22963 =
                              p$22971;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22964 =
                              p$22972;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22965 =
                              ((x10.array.Array<java.lang.String>)x$22963).
                                rank;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22966 =
                              ((int) t22965) ==
                            ((int) 1);
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22967 =
                              !(t22966);
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22967) {
                                
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22968 =
                                  true;
                                
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22968) {
                                    
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22969 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22969;
                                }
                            }
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22970 =
                              ((x10.array.Array<java.lang.String>)x$22963).$apply$G((int)(x$i22964));
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22973 = t22970;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22974 =
                              ret22973;
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22975 =
                              (t22974).indexOf("_inV");
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22976 =
                              ((int) t22975) !=
                            ((int) -1);
                            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22976) {
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22977 =
                                  ((x10.array.Array)(kvs23028));
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$22978 =
                                  counter23005;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22979 =
                                   null;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22948 =
                                  p$22977;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i22949 =
                                  p$22978;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22950 =
                                  ((x10.array.Array<java.lang.String>)x$22948).
                                    rank;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22951 =
                                  ((int) t22950) ==
                                ((int) 1);
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22952 =
                                  !(t22951);
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22952) {
                                    
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22953 =
                                      true;
                                    
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22953) {
                                        
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22954 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22954;
                                    }
                                }
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22955 =
                                  ((x10.array.Array<java.lang.String>)x$22948).$apply$G((int)(x$i22949));
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22979 = t22955;
                                
//#line 394 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value22980 =
                                  ret22979;
                                
//#line 395 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22981 =
                                  value22980;
                                
//#line 395 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr22982 =
                                  x10.lang.StringHelper.split(":", t22981);
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22983 =
                                  foundFriends;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22984 =
                                  ((x10.array.Array)(strArr22982));
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22985 =
                                   null;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22956 =
                                  p$22984;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22957 =
                                  ((x10.array.Array<java.lang.String>)x$22956).
                                    rank;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22958 =
                                  ((int) t22957) ==
                                ((int) 1);
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22959 =
                                  !(t22958);
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22959) {
                                    
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22960 =
                                      true;
                                    
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22960) {
                                        
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22961 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22961;
                                    }
                                }
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22962 =
                                  ((x10.array.Array<java.lang.String>)x$22956).$apply$G((int)(1));
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22985 = t22962;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22986 =
                                  ret22985;
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22987 =
                                  ((x10.util.ArrayList<java.lang.String>)t22983).indexOf__0x10$util$ArrayList$$T$O(((java.lang.String)(t22986)));
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22988 =
                                  ((int) t22987) !=
                                ((int) -1);
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22989 =
                                  !(t22988);
                                
//#line 396 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22989) {
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22990 =
                                      ((x10.array.Array)(strArr22982));
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22991 =
                                       null;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22920 =
                                      p$22990;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22921 =
                                      ((x10.array.Array<java.lang.String>)x$22920).
                                        rank;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22922 =
                                      ((int) t22921) ==
                                    ((int) 1);
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22923 =
                                      !(t22922);
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22923) {
                                        
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22924 =
                                          true;
                                        
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22924) {
                                            
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22925 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22925;
                                        }
                                    }
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22926 =
                                      ((x10.array.Array<java.lang.String>)x$22920).$apply$G((int)(1));
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22991 = t22926;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22992 =
                                      ret22991;
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22993 =
                                      this.getVertexPropertiesByExactID(((java.lang.String)(t22992)));
                                    
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
hMap23032 = t22993;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22994 =
                                      hMap23032;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22995 =
                                      ((x10.array.Array)(strArr22982));
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22996 =
                                       null;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22927 =
                                      p$22995;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22928 =
                                      ((x10.array.Array<java.lang.String>)x$22927).
                                        rank;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22929 =
                                      ((int) t22928) ==
                                    ((int) 1);
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22930 =
                                      !(t22929);
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22930) {
                                        
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22931 =
                                          true;
                                        
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22931) {
                                            
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22932 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22932;
                                        }
                                    }
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22933 =
                                      ((x10.array.Array<java.lang.String>)x$22927).$apply$G((int)(0));
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22996 = t22933;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22997 =
                                      ret22996;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$22998 =
                                      ((x10.array.Array)(strArr22982));
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret22999 =
                                       null;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22934 =
                                      p$22998;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22935 =
                                      ((x10.array.Array<java.lang.String>)x$22934).
                                        rank;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22936 =
                                      ((int) t22935) ==
                                    ((int) 1);
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22937 =
                                      !(t22936);
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22937) {
                                        
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22938 =
                                          true;
                                        
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22938) {
                                            
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22939 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22939;
                                        }
                                    }
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22940 =
                                      ((x10.array.Array<java.lang.String>)x$22934).$apply$G((int)(1));
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret22999 = t22940;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23000 =
                                      ret22999;
                                    
//#line 398 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t22994).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t22997)),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23000)));
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23001 =
                                      foundFriends;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23002 =
                                      ((x10.array.Array)(strArr22982));
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23003 =
                                       null;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$22941 =
                                      p$23002;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22942 =
                                      ((x10.array.Array<java.lang.String>)x$22941).
                                        rank;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22943 =
                                      ((int) t22942) ==
                                    ((int) 1);
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22944 =
                                      !(t22943);
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22944) {
                                        
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22945 =
                                          true;
                                        
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22945) {
                                            
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t22946 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t22946;
                                        }
                                    }
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22947 =
                                      ((x10.array.Array<java.lang.String>)x$22941).$apply$G((int)(1));
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23003 = t22947;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23004 =
                                      ret23003;
                                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<java.lang.String>)t23001).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t23004)));
                                }
                            }
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23006 =
                              i23008;
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23007 =
                              ((t23006) + (((int)(1))));
                            
//#line 392 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23008 = t23007;
                        }
                        
//#line 404 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23033 =
                          result;
                        
//#line 404 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23034 =
                          hMap23032;
                        
//#line 404 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<x10.util.HashMap<java.lang.String, java.lang.String>>)t23033).add__0x10$util$ArrayList$$T$O(((x10.util.HashMap)(t23034)));
                    }
                    
//#line 408 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23035 =
                      appendFlag;
                    
//#line 408 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23035) {
                        
//#line 408 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23035 = withinEntityFlag;
                    }
                    
//#line 408 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23036 =
                      t23035;
                    
//#line 408 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23036) {
                        
//#line 409 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23037 =
                          builder;
                        
//#line 409 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23038 =
                          ch;
                        
//#line 409 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final char t23039 =
                          ((char) (((int)(t23038))));
                        
//#line 409 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23037.add((char)(t23039));
                    }
                }
            }}catch (java.io.IOException e) {
                
//#line 413 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t21523 =
                  e;
                
//#line 413 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21523.printStackTrace();
            }finally {{
                 
//#line 415 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                     
//#line 416 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t21524 =
                       entityStream;
                     
//#line 416 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21524.close();
                 }}catch (java.io.IOException ec) {
                     
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t21525 =
                       ec;
                     
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21525.printStackTrace();
                 }
             }}
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21526 =
              resp;
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.net.URI location =
              t21526.getLocation();
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21527 =
              resp;
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21528 =
              t21527.getStatus();
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21540 =
              ((int) t21528) ==
            ((int) 500);
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21540) {
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21538 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21529 =
                  "Error : POST on ";
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21530 =
                  ((t21529) + (nodeEntryPoIntUri));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21532 =
                  ((t21530) + (", status code "));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21531 =
                  resp;
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21533 =
                  t21531.getStatus();
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21534 =
                  ((t21532) + ((x10.core.Int.$box(t21533))));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21535 =
                  ((t21534) + (", location header "));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21536 =
                  location.toString();
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21537 =
                  ((t21535) + (t21536));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21539 =
                  ((t21537) + (""));
                
//#line 425 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21538.println(((java.lang.Object)(t21539)));
            }
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21541 =
              resp;
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21541.close();
            
//#line 430 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
            }
        
        
//#line 437 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                             update__2$1x10$lang$String$3x10$lang$String$2$O(
                                                                                                             java.lang.String table,
                                                                                                             java.lang.String key,
                                                                                                             x10.util.HashMap values){
            
//#line 438 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String sideEffectString =
              "";
            
//#line 439 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21542 =
              values;
            
//#line 439 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.Set t21543 =
              ((x10.util.Set<java.lang.String>)
                ((x10.util.HashMap<java.lang.String, java.lang.String>)t21542).keySet());
            
//#line 439 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t21544 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.lang.Iterable<java.lang.String>)t21543).iterator());
            
//#line 439 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.lang.Iterator itr =
              ((x10.lang.Iterator<java.lang.String>)
                t21544);
            
//#line 440 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String k =
              null;
            
//#line 440 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String v =
              null;
            
//#line 448 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21551 =
                  sideEffectString;
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t21545 =
                  ((java.util.Date)(new java.util.Date()));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21546 =
                  t21545.getTime();
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t21547 =
                  ((java.sql.Timestamp)(new java.sql.Timestamp(t21546)));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21548 =
                  t21547.toString();
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21549 =
                  java.net.URLEncoder.encode(((java.lang.String)(t21548)),
                                             ((java.lang.String)("utf-8")));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21550 =
                  (("it.LastLogin=%22") + (t21549));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21552 =
                  ((t21550) + ("%22;"));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21553 =
                  ((t21551) + (t21552));
                
//#line 450 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
sideEffectString = t21553;
            }}catch (java.io.UnsupportedEncodingException ex) {
                
//#line 452 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.UnsupportedEncodingException t21554 =
                  ex;
                
//#line 452 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21554.printStackTrace();
            }catch (java.lang.RuntimeException ec) {
                
//#line 454 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.RuntimeException t21555 =
                  ec;
                
//#line 454 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21555.printStackTrace();
            }
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21556 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21557 =
              ((t21556) + ("/graphs/graph/tp/gremlin?script=g.V(%22pername%22%2C%22"));
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21558 =
              key;
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21559 =
              ((t21557) + (t21558));
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21560 =
              ((t21559) + ("%22).sideEffect%7B"));
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21561 =
              sideEffectString;
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21562 =
              ((t21560) + (t21561));
            
//#line 462 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21562) + ("%7D"));
            
//#line 464 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21563 =
              com.sun.jersey.api.client.Client.create();
            
//#line 464 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21563.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 466 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 469 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21564 =
              resp;
            
//#line 469 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.net.URI location =
              t21564.getLocation();
            
//#line 471 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21565 =
              resp;
            
//#line 471 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21565.close();
            
//#line 473 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 482 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                             insert__2$1x10$lang$String$3x10$lang$String$2$O(
                                                                                                             java.lang.String table,
                                                                                                             java.lang.String key,
                                                                                                             x10.util.HashMap values){
            
//#line 483 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21566 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 483 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21566.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX")));
            
//#line 484 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21567 =
              table;
            
//#line 484 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21880 =
              (t21567).equals("transact-insert");
            
//#line 484 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21880) {
                
//#line 485 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
org.xgdbench.generator.Vertex c =
                  null;
                
//#line 486 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                    
//#line 487 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t21568 =
                      ((x10.util.ArrayList)(newVertexQueue));
                    
//#line 487 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t21569 =
                      ((x10.util.ArrayList<org.xgdbench.generator.Vertex>)t21568).removeFirst$G();
                    
//#line 487 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
c = t21569;
                }}catch (java.util.NoSuchElementException e) {
                    
//#line 489 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return -1;
                }
                
//#line 491 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t21570 =
                  c;
                
//#line 491 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.addVertexAndConnectWithExisting(((org.xgdbench.generator.Vertex)(t21570)));
            } else {
                
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21571 =
                  table;
                
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21572 =
                  (t21571).equals("");
                
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21879 =
                  !(t21572);
                
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21879) {
                    
//#line 494 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21573 =
                      table;
                    
//#line 494 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array IntermArr =
                      x10.lang.StringHelper.split("<", t21573);
                    
//#line 495 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21574 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 495 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21574.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX2")));
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20288min23459 =
                      0;
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t23460 =
                      IntermArr;
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23461 =
                      ((x10.array.Array<java.lang.String>)t23460).
                        size;
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20288max23462 =
                      ((t23461) - (((int)(1))));
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23456 =
                      i20288min23459;
                    
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23457 =
                          i23456;
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23458 =
                          ((t23457) <= (((int)(i20288max23462))));
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23458)) {
                            
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                        }
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int u23453 =
                          i23456;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23266 =
                          ((x10.array.Array)(IntermArr));
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23267 =
                          u23453;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23268 =
                           null;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23258 =
                          p$23266;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23259 =
                          p$23267;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23260 =
                          ((x10.array.Array<java.lang.String>)x$23258).
                            rank;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23261 =
                          ((int) t23260) ==
                        ((int) 1);
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23262 =
                          !(t23261);
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23262) {
                            
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23263 =
                              true;
                            
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23263) {
                                
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23264 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23264;
                            }
                        }
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23265 =
                          ((x10.array.Array<java.lang.String>)x$23258).$apply$G((int)(x$i23259));
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23268 = t23265;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23269 =
                          ret23268;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23270 =
                          (t23269).trim();
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23271 =
                          (t23270).equals("");
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23272 =
                          !(t23271);
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23272) {
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23273 =
                              ((x10.array.Array)(IntermArr));
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23274 =
                              u23453;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23275 =
                               null;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23243 =
                              p$23273;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23244 =
                              p$23274;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23245 =
                              ((x10.array.Array<java.lang.String>)x$23243).
                                rank;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23246 =
                              ((int) t23245) ==
                            ((int) 1);
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23247 =
                              !(t23246);
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23247) {
                                
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23248 =
                                  true;
                                
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23248) {
                                    
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23249 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23249;
                                }
                            }
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23250 =
                              ((x10.array.Array<java.lang.String>)x$23243).$apply$G((int)(x$i23244));
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23275 = t23250;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23276 =
                              ret23275;
                            
//#line 499 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array inputArr23277 =
                              x10.lang.StringHelper.split("-", t23276);
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23278 =
                              ((x10.array.Array)(inputArr23277));
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23279 =
                               null;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23251 =
                              p$23278;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23252 =
                              ((x10.array.Array<java.lang.String>)x$23251).
                                rank;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23253 =
                              ((int) t23252) ==
                            ((int) 1);
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23254 =
                              !(t23253);
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23254) {
                                
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23255 =
                                  true;
                                
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23255) {
                                    
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23256 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23256;
                                }
                            }
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23257 =
                              ((x10.array.Array<java.lang.String>)x$23251).$apply$G((int)(0));
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23279 = t23257;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23280 =
                              ret23279;
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23281 =
                              (t23280).equals("E");
                            
//#line 501 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23281) {
                                
//#line 502 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String firstVertexName23282 =
                                  null;
                                
//#line 503 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String secondVertexName23283 =
                                  null;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23284 =
                                  ((x10.array.Array)(inputArr23277));
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23285 =
                                   null;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23124 =
                                  p$23284;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23125 =
                                  ((x10.array.Array<java.lang.String>)x$23124).
                                    rank;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23126 =
                                  ((int) t23125) ==
                                ((int) 1);
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23127 =
                                  !(t23126);
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23127) {
                                    
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23128 =
                                      true;
                                    
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23128) {
                                        
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23129 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23129;
                                    }
                                }
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23130 =
                                  ((x10.array.Array<java.lang.String>)x$23124).$apply$G((int)(1));
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23285 = t23130;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23286 =
                                  ret23285;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array res23287 =
                                  x10.lang.StringHelper.split(" ", t23286);
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23288 =
                                  ((x10.array.Array)(res23287));
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23289 =
                                   null;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23131 =
                                  p$23288;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23132 =
                                  ((x10.array.Array<java.lang.String>)x$23131).
                                    rank;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23133 =
                                  ((int) t23132) ==
                                ((int) 1);
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23134 =
                                  !(t23133);
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23134) {
                                    
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23135 =
                                      true;
                                    
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23135) {
                                        
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23136 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23136;
                                    }
                                }
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23137 =
                                  ((x10.array.Array<java.lang.String>)x$23131).$apply$G((int)(0));
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23289 = t23137;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23290 =
                                  ret23289;
                                
//#line 506 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert23291 =
                                  x10.lang.StringHelper.split(",", t23290);
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23292 =
                                  ((x10.array.Array)(res23287));
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23293 =
                                   null;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23138 =
                                  p$23292;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23139 =
                                  ((x10.array.Array<java.lang.String>)x$23138).
                                    rank;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23140 =
                                  ((int) t23139) ==
                                ((int) 1);
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23141 =
                                  !(t23140);
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23141) {
                                    
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23142 =
                                      true;
                                    
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23142) {
                                        
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23143 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23143;
                                    }
                                }
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23144 =
                                  ((x10.array.Array<java.lang.String>)x$23138).$apply$G((int)(1));
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23293 = t23144;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23294 =
                                  ret23293;
                                
//#line 507 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert23295 =
                                  x10.lang.StringHelper.split(",", t23294);
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23296 =
                                  ((x10.array.Array)(vert23291));
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23297 =
                                   null;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23145 =
                                  p$23296;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23146 =
                                  ((x10.array.Array<java.lang.String>)x$23145).
                                    rank;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23147 =
                                  ((int) t23146) ==
                                ((int) 1);
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23148 =
                                  !(t23147);
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23148) {
                                    
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23149 =
                                      true;
                                    
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23149) {
                                        
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23150 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23150;
                                    }
                                }
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23151 =
                                  ((x10.array.Array<java.lang.String>)x$23145).$apply$G((int)(0));
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23297 = t23151;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23298 =
                                  ret23297;
                                
//#line 509 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert23299 =
                                  x10.lang.StringHelper.split(":", t23298);
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23300 =
                                  ((x10.array.Array)(vert23299));
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23301 =
                                   null;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23152 =
                                  p$23300;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23153 =
                                  ((x10.array.Array<java.lang.String>)x$23152).
                                    rank;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23154 =
                                  ((int) t23153) ==
                                ((int) 1);
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23155 =
                                  !(t23154);
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23155) {
                                    
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23156 =
                                      true;
                                    
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23156) {
                                        
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23157 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23157;
                                    }
                                }
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23158 =
                                  ((x10.array.Array<java.lang.String>)x$23152).$apply$G((int)(0));
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23301 = t23158;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23302 =
                                  ret23301;
                                
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String res23303 =
                                  this.getVertexID(((java.lang.String)(t23302)));
                                
//#line 513 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23304 =
                                  res23303;
                                
//#line 513 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23305 =
                                  (t23304).equals("-1");
                                
//#line 513 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23305) {
                                    
//#line 514 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs23306 =
                                      new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23307 =
                                      vertAttribs23306;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23308 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23309 =
                                       null;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23040 =
                                      p$23308;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23041 =
                                      ((x10.array.Array<java.lang.String>)x$23040).
                                        rank;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23042 =
                                      ((int) t23041) ==
                                    ((int) 1);
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23043 =
                                      !(t23042);
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23043) {
                                        
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23044 =
                                          true;
                                        
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23044) {
                                            
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23045 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23045;
                                        }
                                    }
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23046 =
                                      ((x10.array.Array<java.lang.String>)x$23040).$apply$G((int)(1));
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23309 = t23046;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23310 =
                                      ret23309;
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23311 =
                                      (t23310).toString();
                                    
//#line 515 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23307).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23311)));
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23312 =
                                      vertAttribs23306;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23313 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23314 =
                                       null;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23047 =
                                      p$23313;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23048 =
                                      ((x10.array.Array<java.lang.String>)x$23047).
                                        rank;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23049 =
                                      ((int) t23048) ==
                                    ((int) 1);
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23050 =
                                      !(t23049);
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23050) {
                                        
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23051 =
                                          true;
                                        
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23051) {
                                            
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23052 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23052;
                                        }
                                    }
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23053 =
                                      ((x10.array.Array<java.lang.String>)x$23047).$apply$G((int)(1));
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23314 = t23053;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23315 =
                                      ret23314;
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23316 =
                                      (t23315).toString();
                                    
//#line 516 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23312).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23316)));
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23317 =
                                      vertAttribs23306;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23318 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23319 =
                                       null;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23054 =
                                      p$23318;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23055 =
                                      ((x10.array.Array<java.lang.String>)x$23054).
                                        rank;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23056 =
                                      ((int) t23055) ==
                                    ((int) 1);
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23057 =
                                      !(t23056);
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23057) {
                                        
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23058 =
                                          true;
                                        
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23058) {
                                            
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23059 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23059;
                                        }
                                    }
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23060 =
                                      ((x10.array.Array<java.lang.String>)x$23054).$apply$G((int)(2));
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23319 = t23060;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23320 =
                                      ret23319;
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23321 =
                                      (t23320).toString();
                                    
//#line 517 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23317).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23321)));
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23322 =
                                      vertAttribs23306;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23323 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23324 =
                                       null;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23061 =
                                      p$23323;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23062 =
                                      ((x10.array.Array<java.lang.String>)x$23061).
                                        rank;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23063 =
                                      ((int) t23062) ==
                                    ((int) 1);
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23064 =
                                      !(t23063);
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23064) {
                                        
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23065 =
                                          true;
                                        
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23065) {
                                            
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23066 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23066;
                                        }
                                    }
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23067 =
                                      ((x10.array.Array<java.lang.String>)x$23061).$apply$G((int)(3));
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23324 = t23067;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23325 =
                                      ret23324;
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23326 =
                                      (t23325).toString();
                                    
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23322).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23326)));
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23327 =
                                      vertAttribs23306;
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t23328 =
                                      ((java.util.Date)(new java.util.Date()));
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t23329 =
                                      t23328.getTime();
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t23330 =
                                      ((java.sql.Timestamp)(new java.sql.Timestamp(t23329)));
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23331 =
                                      t23330.toString();
                                    
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23327).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23331)));
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23332 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23333 =
                                       null;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23068 =
                                      p$23332;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23069 =
                                      ((x10.array.Array<java.lang.String>)x$23068).
                                        rank;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23070 =
                                      ((int) t23069) ==
                                    ((int) 1);
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23071 =
                                      !(t23070);
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23071) {
                                        
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23072 =
                                          true;
                                        
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23072) {
                                            
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23073 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23073;
                                        }
                                    }
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23074 =
                                      ((x10.array.Array<java.lang.String>)x$23068).$apply$G((int)(0));
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23333 = t23074;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23334 =
                                      ret23333;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23335 =
                                      vertAttribs23306;
                                    
//#line 521 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t23334)),
                                                                                                                                                                                                              ((x10.util.HashMap)(t23335)));
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23336 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23337 =
                                       null;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23075 =
                                      p$23336;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23076 =
                                      ((x10.array.Array<java.lang.String>)x$23075).
                                        rank;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23077 =
                                      ((int) t23076) ==
                                    ((int) 1);
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23078 =
                                      !(t23077);
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23078) {
                                        
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23079 =
                                          true;
                                        
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23079) {
                                            
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23080 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23080;
                                        }
                                    }
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23081 =
                                      ((x10.array.Array<java.lang.String>)x$23075).$apply$G((int)(0));
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23337 = t23081;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23338 =
                                      ret23337;
                                    
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
firstVertexName23282 = t23338;
                                }
                                
//#line 525 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23339 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 525 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23339.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX3")));
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23340 =
                                  ((x10.array.Array)(vert23295));
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23341 =
                                   null;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23159 =
                                  p$23340;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23160 =
                                  ((x10.array.Array<java.lang.String>)x$23159).
                                    rank;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23161 =
                                  ((int) t23160) ==
                                ((int) 1);
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23162 =
                                  !(t23161);
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23162) {
                                    
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23163 =
                                      true;
                                    
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23163) {
                                        
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23164 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23164;
                                    }
                                }
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23165 =
                                  ((x10.array.Array<java.lang.String>)x$23159).$apply$G((int)(0));
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23341 = t23165;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23342 =
                                  ret23341;
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t23343 =
                                  ((x10.array.Array)(x10.lang.StringHelper.split(":", t23342)));
                                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
vert23299 = t23343;
                                
//#line 528 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.net.URI secondNode23344 =
                                  null;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23345 =
                                  ((x10.array.Array)(vert23299));
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23346 =
                                   null;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23166 =
                                  p$23345;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23167 =
                                  ((x10.array.Array<java.lang.String>)x$23166).
                                    rank;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23168 =
                                  ((int) t23167) ==
                                ((int) 1);
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23169 =
                                  !(t23168);
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23169) {
                                    
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23170 =
                                      true;
                                    
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23170) {
                                        
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23171 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23171;
                                    }
                                }
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23172 =
                                  ((x10.array.Array<java.lang.String>)x$23166).$apply$G((int)(0));
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23346 = t23172;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23347 =
                                  ret23346;
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23348 =
                                  this.getVertexID(((java.lang.String)(t23347)));
                                
//#line 530 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
res23303 = t23348;
                                
//#line 532 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23349 =
                                  res23303;
                                
//#line 532 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23350 =
                                  (t23349).equals("-1");
                                
//#line 532 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23350) {
                                    
//#line 533 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs23351 =
                                      new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23352 =
                                      vertAttribs23351;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23353 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23354 =
                                       null;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23082 =
                                      p$23353;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23083 =
                                      ((x10.array.Array<java.lang.String>)x$23082).
                                        rank;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23084 =
                                      ((int) t23083) ==
                                    ((int) 1);
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23085 =
                                      !(t23084);
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23085) {
                                        
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23086 =
                                          true;
                                        
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23086) {
                                            
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23087 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23087;
                                        }
                                    }
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23088 =
                                      ((x10.array.Array<java.lang.String>)x$23082).$apply$G((int)(1));
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23354 = t23088;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23355 =
                                      ret23354;
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23356 =
                                      (t23355).toString();
                                    
//#line 534 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23352).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23356)));
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23357 =
                                      vertAttribs23351;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23358 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23359 =
                                       null;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23089 =
                                      p$23358;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23090 =
                                      ((x10.array.Array<java.lang.String>)x$23089).
                                        rank;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23091 =
                                      ((int) t23090) ==
                                    ((int) 1);
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23092 =
                                      !(t23091);
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23092) {
                                        
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23093 =
                                          true;
                                        
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23093) {
                                            
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23094 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23094;
                                        }
                                    }
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23095 =
                                      ((x10.array.Array<java.lang.String>)x$23089).$apply$G((int)(1));
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23359 = t23095;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23360 =
                                      ret23359;
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23361 =
                                      (t23360).toString();
                                    
//#line 535 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23357).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23361)));
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23362 =
                                      vertAttribs23351;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23363 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23364 =
                                       null;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23096 =
                                      p$23363;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23097 =
                                      ((x10.array.Array<java.lang.String>)x$23096).
                                        rank;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23098 =
                                      ((int) t23097) ==
                                    ((int) 1);
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23099 =
                                      !(t23098);
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23099) {
                                        
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23100 =
                                          true;
                                        
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23100) {
                                            
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23101 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23101;
                                        }
                                    }
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23102 =
                                      ((x10.array.Array<java.lang.String>)x$23096).$apply$G((int)(2));
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23364 = t23102;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23365 =
                                      ret23364;
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23366 =
                                      (t23365).toString();
                                    
//#line 536 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23362).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23366)));
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23367 =
                                      vertAttribs23351;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23368 =
                                      ((x10.array.Array)(vert23291));
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23369 =
                                       null;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23103 =
                                      p$23368;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23104 =
                                      ((x10.array.Array<java.lang.String>)x$23103).
                                        rank;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23105 =
                                      ((int) t23104) ==
                                    ((int) 1);
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23106 =
                                      !(t23105);
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23106) {
                                        
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23107 =
                                          true;
                                        
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23107) {
                                            
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23108 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23108;
                                        }
                                    }
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23109 =
                                      ((x10.array.Array<java.lang.String>)x$23103).$apply$G((int)(3));
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23369 = t23109;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23370 =
                                      ret23369;
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23371 =
                                      (t23370).toString();
                                    
//#line 537 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23367).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23371)));
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23372 =
                                      vertAttribs23351;
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t23373 =
                                      ((java.util.Date)(new java.util.Date()));
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t23374 =
                                      t23373.getTime();
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t23375 =
                                      ((java.sql.Timestamp)(new java.sql.Timestamp(t23374)));
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23376 =
                                      t23375.toString();
                                    
//#line 538 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23372).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23376)));
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23377 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23378 =
                                       null;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23110 =
                                      p$23377;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23111 =
                                      ((x10.array.Array<java.lang.String>)x$23110).
                                        rank;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23112 =
                                      ((int) t23111) ==
                                    ((int) 1);
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23113 =
                                      !(t23112);
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23113) {
                                        
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23114 =
                                          true;
                                        
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23114) {
                                            
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23115 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23115;
                                        }
                                    }
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23116 =
                                      ((x10.array.Array<java.lang.String>)x$23110).$apply$G((int)(0));
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23378 = t23116;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23379 =
                                      ret23378;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23380 =
                                      vertAttribs23351;
                                    
//#line 540 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t23379)),
                                                                                                                                                                                                              ((x10.util.HashMap)(t23380)));
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23381 =
                                      ((x10.array.Array)(vert23299));
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23382 =
                                       null;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23117 =
                                      p$23381;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23118 =
                                      ((x10.array.Array<java.lang.String>)x$23117).
                                        rank;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23119 =
                                      ((int) t23118) ==
                                    ((int) 1);
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23120 =
                                      !(t23119);
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23120) {
                                        
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23121 =
                                          true;
                                        
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23121) {
                                            
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23122 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23122;
                                        }
                                    }
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23123 =
                                      ((x10.array.Array<java.lang.String>)x$23117).$apply$G((int)(0));
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23382 = t23123;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23383 =
                                      ret23382;
                                    
//#line 541 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
secondVertexName23283 = t23383;
                                }
                                
//#line 543 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23384 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 543 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23384.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX4")));
                                
//#line 544 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                                    
//#line 545 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23385 =
                                      firstVertexName23282;
                                    
//#line 545 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23386 =
                                      secondVertexName23283;
                                    
//#line 545 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.addRelationship(((java.lang.String)(t23385)),
                                                                                                                                                            ((java.lang.String)(t23386)),
                                                                                                                                                            ((java.lang.String)("affiliated")));
                                }}catch (java.lang.RuntimeException e23387) {
                                    
//#line 547 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.RuntimeException t23388 =
                                      e23387;
                                    
//#line 547 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23388.printStackTrace();
                                }
                            } else {
                                
//#line 550 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23389 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 550 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23389.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX5")));
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23390 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23391 =
                                  ((x10.array.Array)(inputArr23277));
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23392 =
                                   null;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23208 =
                                  p$23391;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23209 =
                                  ((x10.array.Array<java.lang.String>)x$23208).
                                    rank;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23210 =
                                  ((int) t23209) ==
                                ((int) 1);
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23211 =
                                  !(t23210);
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23211) {
                                    
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23212 =
                                      true;
                                    
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23212) {
                                        
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23213 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23213;
                                    }
                                }
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23214 =
                                  ((x10.array.Array<java.lang.String>)x$23208).$apply$G((int)(1));
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23392 = t23214;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23393 =
                                  ret23392;
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23394 =
                                  (("inputArr(1) : ") + (t23393));
                                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23390.println(((java.lang.Object)(t23394)));
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23395 =
                                  ((x10.array.Array)(inputArr23277));
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23396 =
                                   null;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23215 =
                                  p$23395;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23216 =
                                  ((x10.array.Array<java.lang.String>)x$23215).
                                    rank;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23217 =
                                  ((int) t23216) ==
                                ((int) 1);
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23218 =
                                  !(t23217);
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23218) {
                                    
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23219 =
                                      true;
                                    
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23219) {
                                        
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23220 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23220;
                                    }
                                }
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23221 =
                                  ((x10.array.Array<java.lang.String>)x$23215).$apply$G((int)(1));
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23396 = t23221;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23397 =
                                  ret23396;
                                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert23398 =
                                  x10.lang.StringHelper.split(",", t23397);
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23399 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23400 =
                                  ((x10.array.Array)(vert23398));
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23401 =
                                   null;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23222 =
                                  p$23400;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23223 =
                                  ((x10.array.Array<java.lang.String>)x$23222).
                                    rank;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23224 =
                                  ((int) t23223) ==
                                ((int) 1);
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23225 =
                                  !(t23224);
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23225) {
                                    
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23226 =
                                      true;
                                    
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23226) {
                                        
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23227 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23227;
                                    }
                                }
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23228 =
                                  ((x10.array.Array<java.lang.String>)x$23222).$apply$G((int)(0));
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23401 = t23228;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23402 =
                                  ret23401;
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23403 =
                                  (("vert1(0) : ") + (t23402));
                                
//#line 555 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23399.println(((java.lang.Object)(t23403)));
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23404 =
                                  ((x10.array.Array)(vert23398));
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23405 =
                                   null;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23229 =
                                  p$23404;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23230 =
                                  ((x10.array.Array<java.lang.String>)x$23229).
                                    rank;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23231 =
                                  ((int) t23230) ==
                                ((int) 1);
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23232 =
                                  !(t23231);
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23232) {
                                    
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23233 =
                                      true;
                                    
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23233) {
                                        
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23234 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23234;
                                    }
                                }
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23235 =
                                  ((x10.array.Array<java.lang.String>)x$23229).$apply$G((int)(0));
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23405 = t23235;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23406 =
                                  ret23405;
                                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert23407 =
                                  x10.lang.StringHelper.split(":", t23406);
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23408 =
                                  ((x10.array.Array)(vert23407));
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23409 =
                                   null;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23236 =
                                  p$23408;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23237 =
                                  ((x10.array.Array<java.lang.String>)x$23236).
                                    rank;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23238 =
                                  ((int) t23237) ==
                                ((int) 1);
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23239 =
                                  !(t23238);
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23239) {
                                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23240 =
                                      true;
                                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23240) {
                                        
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23241 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23241;
                                    }
                                }
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23242 =
                                  ((x10.array.Array<java.lang.String>)x$23236).$apply$G((int)(0));
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23409 = t23242;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23410 =
                                  ret23409;
                                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String res23411 =
                                  this.getVertexID(((java.lang.String)(t23410)));
                                
//#line 558 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23412 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 558 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23412.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX5--1")));
                                
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23413 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23414 =
                                  res23411;
                                
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23415 =
                                  (("ZZZZZZZZZZZZZZZZZZZZZZZZX res : ") + (t23414));
                                
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23413.println(((java.lang.Object)(t23415)));
                                
//#line 560 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23416 =
                                  res23411;
                                
//#line 560 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23417 =
                                  (t23416).equals("-1");
                                
//#line 560 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23417) {
                                    
//#line 561 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs23418 =
                                      new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23419 =
                                      vertAttribs23418;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23420 =
                                      ((x10.array.Array)(vert23407));
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23421 =
                                       null;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23173 =
                                      p$23420;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23174 =
                                      ((x10.array.Array<java.lang.String>)x$23173).
                                        rank;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23175 =
                                      ((int) t23174) ==
                                    ((int) 1);
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23176 =
                                      !(t23175);
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23176) {
                                        
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23177 =
                                          true;
                                        
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23177) {
                                            
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23178 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23178;
                                        }
                                    }
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23179 =
                                      ((x10.array.Array<java.lang.String>)x$23173).$apply$G((int)(1));
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23421 = t23179;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23422 =
                                      ret23421;
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23423 =
                                      (t23422).toString();
                                    
//#line 562 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23419).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23423)));
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23424 =
                                      vertAttribs23418;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23425 =
                                      ((x10.array.Array)(vert23398));
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23426 =
                                       null;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23180 =
                                      p$23425;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23181 =
                                      ((x10.array.Array<java.lang.String>)x$23180).
                                        rank;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23182 =
                                      ((int) t23181) ==
                                    ((int) 1);
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23183 =
                                      !(t23182);
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23183) {
                                        
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23184 =
                                          true;
                                        
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23184) {
                                            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23185 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23185;
                                        }
                                    }
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23186 =
                                      ((x10.array.Array<java.lang.String>)x$23180).$apply$G((int)(1));
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23426 = t23186;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23427 =
                                      ret23426;
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23428 =
                                      (t23427).toString();
                                    
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23424).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23428)));
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23429 =
                                      vertAttribs23418;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23430 =
                                      ((x10.array.Array)(vert23398));
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23431 =
                                       null;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23187 =
                                      p$23430;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23188 =
                                      ((x10.array.Array<java.lang.String>)x$23187).
                                        rank;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23189 =
                                      ((int) t23188) ==
                                    ((int) 1);
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23190 =
                                      !(t23189);
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23190) {
                                        
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23191 =
                                          true;
                                        
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23191) {
                                            
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23192 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23192;
                                        }
                                    }
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23193 =
                                      ((x10.array.Array<java.lang.String>)x$23187).$apply$G((int)(2));
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23431 = t23193;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23432 =
                                      ret23431;
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23433 =
                                      (t23432).toString();
                                    
//#line 564 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23429).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23433)));
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23434 =
                                      vertAttribs23418;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23435 =
                                      ((x10.array.Array)(vert23398));
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23436 =
                                       null;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23194 =
                                      p$23435;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23195 =
                                      ((x10.array.Array<java.lang.String>)x$23194).
                                        rank;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23196 =
                                      ((int) t23195) ==
                                    ((int) 1);
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23197 =
                                      !(t23196);
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23197) {
                                        
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23198 =
                                          true;
                                        
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23198) {
                                            
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23199 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23199;
                                        }
                                    }
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23200 =
                                      ((x10.array.Array<java.lang.String>)x$23194).$apply$G((int)(3));
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23436 = t23200;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23437 =
                                      ret23436;
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23438 =
                                      (t23437).toString();
                                    
//#line 565 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23434).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23438)));
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23439 =
                                      vertAttribs23418;
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t23440 =
                                      ((java.util.Date)(new java.util.Date()));
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t23441 =
                                      t23440.getTime();
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t23442 =
                                      ((java.sql.Timestamp)(new java.sql.Timestamp(t23441)));
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23443 =
                                      t23442.toString();
                                    
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23439).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                      ((java.lang.String)(t23443)));
                                    
//#line 567 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23444 =
                                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                    
//#line 567 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23444.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX===5===1")));
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23445 =
                                      ((x10.array.Array)(vert23407));
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23446 =
                                       null;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23201 =
                                      p$23445;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23202 =
                                      ((x10.array.Array<java.lang.String>)x$23201).
                                        rank;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23203 =
                                      ((int) t23202) ==
                                    ((int) 1);
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23204 =
                                      !(t23203);
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23204) {
                                        
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23205 =
                                          true;
                                        
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23205) {
                                            
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23206 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23206;
                                        }
                                    }
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23207 =
                                      ((x10.array.Array<java.lang.String>)x$23201).$apply$G((int)(0));
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23446 = t23207;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23447 =
                                      ret23446;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23448 =
                                      vertAttribs23418;
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23449 =
                                      this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t23447)),
                                                                                                             ((x10.util.HashMap)(t23448)));
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23450 =
                                      (t23449).equals("-1");
                                    
//#line 568 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23450) {
                                        
//#line 569 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return -1;
                                    }
                                    
//#line 571 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23451 =
                                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                    
//#line 571 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23451.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX99")));
                                }
                                
//#line 574 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23452 =
                                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
//#line 574 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23452.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZX6")));
                            }
                        }
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23454 =
                          i23456;
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23455 =
                          ((t23454) + (((int)(1))));
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23456 = t23455;
                    }
                }
            }
            
//#line 581 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21881 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 581 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21881.println(((java.lang.Object)("Returned from here")));
            
//#line 583 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 590 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                             delete$O(
                                                                                                             java.lang.String table,
                                                                                                             java.lang.String key){
            
//#line 592 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21882 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 592 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21882.println(((java.lang.Object)("Error : Deletion operation has not been implemented on Titan 0.1.0.")));
            
//#line 593 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 601 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private void
                                                                                                             addVertexAndConnectWithExisting(
                                                                                                             org.xgdbench.generator.Vertex c){
            
//#line 602 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t21883 =
              c;
            
//#line 602 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array listOfvertices =
              t21883.
                neighbours;
            
//#line 603 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t21884 =
              c;
            
//#line 603 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array attribs =
              t21884.
                attribs;
            
//#line 604 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final org.xgdbench.generator.Vertex t21885 =
              c;
            
//#line 604 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21886 =
              t21885.
                pername;
            
//#line 604 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String firstVertex =
              (("") + ((x10.core.Long.$box(t21886))));
            
//#line 605 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String secondVertex =
              null;
            
//#line 607 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21887 =
              firstVertex;
            
//#line 607 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String res =
              this.getVertexID(((java.lang.String)(t21887)));
            
//#line 609 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21888 =
              res;
            
//#line 609 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21935 =
              (t21888).equals("-1");
            
//#line 609 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21935) {
                
//#line 610 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs =
                  new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21896 =
                  vertAttribs;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$20751 =
                  ((x10.array.Array)(attribs));
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret20755 =
                   0;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23463 =
                  p$20751;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23464 =
                  ((x10.array.Array<x10.core.Int>)x$23463).
                    rank;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23465 =
                  ((int) t23464) ==
                ((int) 1);
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23466 =
                  !(t23465);
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23466) {
                    
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23467 =
                      true;
                    
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23467) {
                        
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23468 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23468;
                    }
                }
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23469 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$23463).$apply$G((int)(0)));
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret20755 = t23469;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21895 =
                  ret20755;
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21897 =
                  java.lang.Integer.toString(t21895);
                
//#line 611 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t21896).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                  ((java.lang.String)(t21897)));
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21905 =
                  vertAttribs;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$20757 =
                  ((x10.array.Array)(attribs));
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret20761 =
                   0;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23470 =
                  p$20757;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23471 =
                  ((x10.array.Array<x10.core.Int>)x$23470).
                    rank;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23472 =
                  ((int) t23471) ==
                ((int) 1);
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23473 =
                  !(t23472);
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23473) {
                    
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23474 =
                      true;
                    
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23474) {
                        
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23475 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23475;
                    }
                }
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23476 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$23470).$apply$G((int)(1)));
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret20761 = t23476;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21904 =
                  ret20761;
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21906 =
                  java.lang.Integer.toString(t21904);
                
//#line 612 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t21905).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                  ((java.lang.String)(t21906)));
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21914 =
                  vertAttribs;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$20763 =
                  ((x10.array.Array)(attribs));
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret20767 =
                   0;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23477 =
                  p$20763;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23478 =
                  ((x10.array.Array<x10.core.Int>)x$23477).
                    rank;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23479 =
                  ((int) t23478) ==
                ((int) 1);
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23480 =
                  !(t23479);
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23480) {
                    
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23481 =
                      true;
                    
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23481) {
                        
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23482 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23482;
                    }
                }
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23483 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$23477).$apply$G((int)(2)));
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret20767 = t23483;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21913 =
                  ret20767;
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21915 =
                  java.lang.Integer.toString(t21913);
                
//#line 613 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t21914).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                  ((java.lang.String)(t21915)));
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21923 =
                  vertAttribs;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$20769 =
                  ((x10.array.Array)(attribs));
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret20773 =
                   0;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23484 =
                  p$20769;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23485 =
                  ((x10.array.Array<x10.core.Int>)x$23484).
                    rank;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23486 =
                  ((int) t23485) ==
                ((int) 1);
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23487 =
                  !(t23486);
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23487) {
                    
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23488 =
                      true;
                    
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23488) {
                        
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23489 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23489;
                    }
                }
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23490 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$23484).$apply$G((int)(3)));
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret20773 = t23490;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21922 =
                  ret20773;
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21924 =
                  java.lang.Integer.toString(t21922);
                
//#line 614 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t21923).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                  ((java.lang.String)(t21924)));
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21928 =
                  vertAttribs;
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t21925 =
                  ((java.util.Date)(new java.util.Date()));
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t21926 =
                  t21925.getTime();
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t21927 =
                  ((java.sql.Timestamp)(new java.sql.Timestamp(t21926)));
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21929 =
                  t21927.toString();
                
//#line 615 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t21928).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                  ((java.lang.String)(t21929)));
                
//#line 617 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21930 =
                  firstVertex;
                
//#line 617 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21931 =
                  vertAttribs;
                
//#line 617 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t21930)),
                                                                                                                                                                                          ((x10.util.HashMap)(t21931)));
            } else {
                
//#line 620 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21933 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 620 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21932 =
                  firstVertex;
                
//#line 620 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21934 =
                  (("Error : The new vertex exists in the Graph!! Vert ID : ") + (t21932));
                
//#line 620 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21933.println(((java.lang.Object)(t21934)));
            }
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20304min23521 =
              0;
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t23522 =
              listOfvertices;
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23523 =
              ((x10.array.Array<x10.core.Int>)t23522).
                size;
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20304max23524 =
              ((t23523) - (((int)(1))));
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23516 =
              i20304min23521;
            
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23517 =
                  i23516;
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23518 =
                  ((t23517) <= (((int)(i20304max23524))));
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23518)) {
                    
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
L23519: {
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i23520 =
                  i23516;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23499 =
                  ((x10.array.Array)(listOfvertices));
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23500 =
                  i23520;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ret23501 =
                   0;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23491 =
                  p$23499;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23492 =
                  p$23500;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23493 =
                  ((x10.array.Array<x10.core.Int>)x$23491).
                    rank;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23494 =
                  ((int) t23493) ==
                ((int) 1);
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23495 =
                  !(t23494);
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23495) {
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23496 =
                      true;
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23496) {
                        
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23497 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23497;
                    }
                }
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23498 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$23491).$apply$G((int)(x$i23492)));
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23501 = t23498;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23502 =
                  ret23501;
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23503 =
                  (("") + ((x10.core.Int.$box(t23502))));
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
secondVertex = t23503;
//#line 626 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23504 =
                  secondVertex;
//#line 626 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23505 =
                  this.getVertexID(((java.lang.String)(t23504)));
//#line 626 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
res = t23505;
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23506 =
                  res;
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23507 =
                  (t23506).equals("-1");
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23507) {
                    
//#line 629 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t23508 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 629 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23509 =
                      secondVertex;
                    
//#line 629 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23510 =
                      (("Error : It says that the vertex ") + (t23509));
                    
//#line 629 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23511 =
                      ((t23510) + ("does not exist."));
                    
//#line 629 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23508.println(((java.lang.Object)(t23511)));
                    
//#line 630 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break L23519;
                }
//#line 633 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23512 =
                  firstVertex;
//#line 633 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23513 =
                  secondVertex;
//#line 633 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.addRelationship(((java.lang.String)(t23512)),
                                                                                                                                                       ((java.lang.String)(t23513)),
                                                                                                                                                       ((java.lang.String)("affiliated")));}
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23514 =
                  i23516;
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23515 =
                  ((t23514) + (((int)(1))));
                
//#line 623 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23516 = t23515;
            }
        }
        
        public static void
          addVertexAndConnectWithExisting$P(
          org.xgdbench.generator.Vertex c,
          final org.xgdbench.TitanClient TitanClient){
            TitanClient.addVertexAndConnectWithExisting(((org.xgdbench.generator.Vertex)(c)));
        }
        
        
//#line 644 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public java.lang.String
                                                                                                             addRelationship(
                                                                                                             java.lang.String fromVertex,
                                                                                                             java.lang.String toVertex,
                                                                                                             java.lang.String relationshipName){
            
//#line 645 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String result =
              "-1";
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21961 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21962 =
              ((java.lang.String)(indexName));
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21963 =
              fromVertex;
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21964 =
              toVertex;
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21965 =
              relationshipName;
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21966 =
              org.xgdbench.java.TitanClient_Java.addRelationship(t21961, t21962, t21963, t21964, t21965);
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t21966;
            
//#line 677 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21967 =
              result;
            
//#line 677 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21967;
        }
        
        
//#line 685 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public boolean
                                                                                                             createVertexIndex$O(
                                                                                                             java.lang.String indexName){
            
//#line 686 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21968 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 686 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21968.println(((java.lang.Object)("AAAAAA")));
            
//#line 687 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean result =
              false;
            
//#line 703 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21969 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 703 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21970 =
              indexName;
            
//#line 703 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21971 =
              org.xgdbench.java.TitanClient_Java.createVertexIndex(t21969, t21970);
            
//#line 703 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t21971;
            
//#line 705 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t21972 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 705 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21972.println(((java.lang.Object)("AAAAAA7")));
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21973 =
              result;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21973;
        }
        
        
//#line 716 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public boolean
                                                                                                             addVertexToIndex$O(
                                                                                                             java.lang.String indexName,
                                                                                                             java.lang.String vertexID,
                                                                                                             java.lang.String vertexName){
            
//#line 717 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean result =
              false;
            
//#line 719 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21974 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 719 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t21974) + ("/graphs/graph/tp/gremlin"));
            
//#line 721 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t21975 =
              com.sun.jersey.api.client.Client.create();
            
//#line 721 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t21975.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 724 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 726 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21976 =
              resp;
            
//#line 726 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.net.URI location =
              t21976.getLocation();
            
//#line 728 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21977 =
              resp;
            
//#line 728 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t21978 =
              t21977.getStatus();
            
//#line 728 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21979 =
              ((int) t21978) ==
            ((int) 200);
            
//#line 728 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t21979) {
                
//#line 729 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = true;
            }
            
//#line 732 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t21980 =
              resp;
            
//#line 732 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t21980.close();
            
//#line 738 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t21981 =
              result;
            
//#line 738 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21981;
        }
        
        
//#line 748 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private java.lang.String
                                                                                                             createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(
                                                                                                             java.lang.String vertexName,
                                                                                                             x10.util.HashMap values){
            
//#line 749 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String result =
              "-1";
            
//#line 818 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t21982 =
              values;
            
//#line 818 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String hmap_sa_string =
              this.convertHmapToString__0$1x10$lang$String$3x10$lang$String$2(((x10.util.HashMap)(t21982)));
            
//#line 820 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21983 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 820 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21984 =
              ((java.lang.String)(indexName));
            
//#line 820 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21985 =
              vertexName;
            
//#line 820 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21986 =
              org.xgdbench.java.TitanClient_Java.createVertexWithProperties(t21983, t21984, t21985, hmap_sa_string);
            
//#line 820 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t21986;
            
//#line 822 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21987 =
              result;
            
//#line 822 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21987;
        }
        
        public static java.lang.String
          createVertexWithProperties$P__1$1x10$lang$String$3x10$lang$String$2(
          java.lang.String vertexName,
          x10.util.HashMap<java.lang.String, java.lang.String> values,
          final org.xgdbench.TitanClient TitanClient){
            return TitanClient.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(vertexName)),
                                                                                                 ((x10.util.HashMap)(values)));
        }
        
        
//#line 826 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private java.lang.String
                                                                                                             convertHmapToString__0$1x10$lang$String$3x10$lang$String$2(
                                                                                                             x10.util.HashMap values){
            
//#line 827 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String result =
              "";
            
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23533 =
              values;
            
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.Set t23534 =
              ((x10.util.Set<java.lang.String>)
                ((x10.util.HashMap<java.lang.String, java.lang.String>)t23533).keySet());
            
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator item23535 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.lang.Iterable<java.lang.String>)t23534).iterator());
            
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23536 =
                  ((x10.lang.Iterator<java.lang.String>)item23535).hasNext$O();
                
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23536)) {
                    
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 828 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String item23525 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)item23535).next$G()));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23526 =
                  result;
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23527 =
                  ((item23525) + (":"));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23528 =
                  values;
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.Box t23529 =
                  ((x10.util.Box<java.lang.String>)
                    ((x10.util.HashMap<java.lang.String, java.lang.String>)t23528).get__0x10$util$HashMap$$K(((java.lang.String)(item23525))));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23530 =
                  ((t23527) + (t23529));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23531 =
                  ((t23530) + ("-"));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23532 =
                  ((t23526) + (t23531));
                
//#line 829 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t23532;
            }
            
//#line 832 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t21999 =
              result;
            
//#line 832 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t21999;
        }
        
        public static java.lang.String
          convertHmapToString$P__0$1x10$lang$String$3x10$lang$String$2(
          x10.util.HashMap<java.lang.String, java.lang.String> values,
          final org.xgdbench.TitanClient TitanClient){
            return TitanClient.convertHmapToString__0$1x10$lang$String$3x10$lang$String$2(((x10.util.HashMap)(values)));
        }
        
        
//#line 841 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
private java.lang.String
                                                                                                             getVertexID(
                                                                                                             java.lang.String vertexName){
            
//#line 842 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String result =
              "-1";
            
//#line 897 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22000 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 897 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22001 =
              ((java.lang.String)(indexName));
            
//#line 897 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22002 =
              vertexName;
            
//#line 897 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22003 =
              org.xgdbench.java.TitanClient_Java.getVertexID(t22000, t22001, t22002);
            
//#line 897 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t22003;
            
//#line 899 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22004 =
              result;
            
//#line 899 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t22004;
        }
        
        public static java.lang.String
          getVertexID$P(
          java.lang.String vertexName,
          final org.xgdbench.TitanClient TitanClient){
            return TitanClient.getVertexID(((java.lang.String)(vertexName)));
        }
        
        
//#line 907 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public x10.util.HashMap
                                                                                                             getVertexPropertiesByExactID(
                                                                                                             java.lang.String vertexID){
            
//#line 908 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap result =
              new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
            
//#line 911 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22005 =
              ((java.lang.String)(SERVER_ROOT_URI));
            
//#line 911 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22006 =
              ((t22005) + ("/graphs/graph/vertices/"));
            
//#line 911 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22007 =
              vertexID;
            
//#line 911 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri =
              ((t22006) + (t22007));
            
//#line 913 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t22008 =
              com.sun.jersey.api.client.Client.create();
            
//#line 913 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource =
              t22008.resource(((java.lang.String)(nodeEntryPoIntUri)));
            
//#line 916 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp =
              null;
            
//#line 919 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String entity =
              null;
            
//#line 921 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22009 =
              entity;
            
//#line 921 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22010 =
              (t22009).lastIndexOf("{");
            
//#line 921 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int firstIndex =
              ((t22010) + (((int)(1))));
            
//#line 923 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22011 =
              entity;
            
//#line 923 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22012 =
              firstIndex;
            
//#line 923 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22013 =
              (t22011).substring(((int)(t22012)));
            
//#line 923 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22014 =
              (t22013).trim();
            
//#line 923 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
entity = t22014;
            
//#line 924 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22015 =
              entity;
            
//#line 924 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int lastIndex =
              (t22015).indexOf("}");
            
//#line 925 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22016 =
              entity;
            
//#line 925 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22017 =
              lastIndex;
            
//#line 925 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22018 =
              (t22016).substring(((int)(0)), ((int)(t22017)));
            
//#line 925 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22019 =
              (t22018).trim();
            
//#line 925 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
entity = t22019;
            
//#line 927 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22020 =
              entity;
            
//#line 927 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array kvs =
              x10.lang.StringHelper.split(",", t22020);
            
//#line 929 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t22021 =
              kvs;
            
//#line 929 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int len =
              ((x10.array.Array<java.lang.String>)t22021).
                size;
            
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20322min23690 =
              0;
            
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23691 =
              len;
            
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20322max23692 =
              ((t23691) - (((int)(1))));
            
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23687 =
              i20322min23690;
            
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23688 =
                  i23687;
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23689 =
                  ((t23688) <= (((int)(i20322max23692))));
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23689)) {
                    
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int counter23684 =
                  i23687;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23627 =
                  ((x10.array.Array)(kvs));
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23628 =
                  counter23684;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23629 =
                   null;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23603 =
                  p$23627;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23604 =
                  p$23628;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23605 =
                  ((x10.array.Array<java.lang.String>)x$23603).
                    rank;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23606 =
                  ((int) t23605) ==
                ((int) 1);
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23607 =
                  !(t23606);
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23607) {
                    
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23608 =
                      true;
                    
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23608) {
                        
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23609 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23609;
                    }
                }
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23610 =
                  ((x10.array.Array<java.lang.String>)x$23603).$apply$G((int)(x$i23604));
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23629 = t23610;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23630 =
                  ret23629;
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23631 =
                  (t23630).indexOf("name");
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23632 =
                  ((int) t23631) !=
                ((int) -1);
                
//#line 933 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23632) {
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23633 =
                      ((x10.array.Array)(kvs));
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23634 =
                      counter23684;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23635 =
                       null;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23537 =
                      p$23633;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23538 =
                      p$23634;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23539 =
                      ((x10.array.Array<java.lang.String>)x$23537).
                        rank;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23540 =
                      ((int) t23539) ==
                    ((int) 1);
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23541 =
                      !(t23540);
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23541) {
                        
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23542 =
                          true;
                        
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23542) {
                            
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23543 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23543;
                        }
                    }
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23544 =
                      ((x10.array.Array<java.lang.String>)x$23537).$apply$G((int)(x$i23538));
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23635 = t23544;
                    
//#line 934 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value23636 =
                      ret23635;
                    
//#line 935 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23637 =
                      value23636;
                    
//#line 935 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr23638 =
                      x10.lang.StringHelper.split(":", t23637);
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23639 =
                      result;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23640 =
                      ((x10.array.Array)(strArr23638));
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23641 =
                       null;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23545 =
                      p$23640;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23546 =
                      ((x10.array.Array<java.lang.String>)x$23545).
                        rank;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23547 =
                      ((int) t23546) ==
                    ((int) 1);
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23548 =
                      !(t23547);
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23548) {
                        
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23549 =
                          true;
                        
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23549) {
                            
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23550 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23550;
                        }
                    }
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23551 =
                      ((x10.array.Array<java.lang.String>)x$23545).$apply$G((int)(0));
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23641 = t23551;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23642 =
                      ret23641;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23643 =
                      ((x10.array.Array)(strArr23638));
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23644 =
                       null;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23552 =
                      p$23643;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23553 =
                      ((x10.array.Array<java.lang.String>)x$23552).
                        rank;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23554 =
                      ((int) t23553) ==
                    ((int) 1);
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23555 =
                      !(t23554);
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23555) {
                        
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23556 =
                          true;
                        
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23556) {
                            
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23557 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23557;
                        }
                    }
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23558 =
                      ((x10.array.Array<java.lang.String>)x$23552).$apply$G((int)(1));
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23644 = t23558;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23645 =
                      ret23644;
                    
//#line 936 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23639).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t23642)),
                                                                                                                                                                                                                                      ((java.lang.String)(t23645)));
                }
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23646 =
                  ((x10.array.Array)(kvs));
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23647 =
                  counter23684;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23648 =
                   null;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23611 =
                  p$23646;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23612 =
                  p$23647;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23613 =
                  ((x10.array.Array<java.lang.String>)x$23611).
                    rank;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23614 =
                  ((int) t23613) ==
                ((int) 1);
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23615 =
                  !(t23614);
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23615) {
                    
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23616 =
                      true;
                    
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23616) {
                        
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23617 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23617;
                    }
                }
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23618 =
                  ((x10.array.Array<java.lang.String>)x$23611).$apply$G((int)(x$i23612));
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23648 = t23618;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23649 =
                  ret23648;
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23650 =
                  (t23649).indexOf("attrib");
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23651 =
                  ((int) t23650) !=
                ((int) -1);
                
//#line 939 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23651) {
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23652 =
                      ((x10.array.Array)(kvs));
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23653 =
                      counter23684;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23654 =
                       null;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23559 =
                      p$23652;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23560 =
                      p$23653;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23561 =
                      ((x10.array.Array<java.lang.String>)x$23559).
                        rank;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23562 =
                      ((int) t23561) ==
                    ((int) 1);
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23563 =
                      !(t23562);
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23563) {
                        
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23564 =
                          true;
                        
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23564) {
                            
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23565 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23565;
                        }
                    }
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23566 =
                      ((x10.array.Array<java.lang.String>)x$23559).$apply$G((int)(x$i23560));
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23654 = t23566;
                    
//#line 940 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value23655 =
                      ret23654;
                    
//#line 941 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23656 =
                      value23655;
                    
//#line 941 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr23657 =
                      x10.lang.StringHelper.split(":", t23656);
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23658 =
                      result;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23659 =
                      ((x10.array.Array)(strArr23657));
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23660 =
                       null;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23567 =
                      p$23659;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23568 =
                      ((x10.array.Array<java.lang.String>)x$23567).
                        rank;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23569 =
                      ((int) t23568) ==
                    ((int) 1);
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23570 =
                      !(t23569);
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23570) {
                        
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23571 =
                          true;
                        
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23571) {
                            
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23572 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23572;
                        }
                    }
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23573 =
                      ((x10.array.Array<java.lang.String>)x$23567).$apply$G((int)(0));
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23660 = t23573;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23661 =
                      ret23660;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23662 =
                      ((x10.array.Array)(strArr23657));
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23663 =
                       null;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23574 =
                      p$23662;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23575 =
                      ((x10.array.Array<java.lang.String>)x$23574).
                        rank;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23576 =
                      ((int) t23575) ==
                    ((int) 1);
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23577 =
                      !(t23576);
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23577) {
                        
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23578 =
                          true;
                        
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23578) {
                            
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23579 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23579;
                        }
                    }
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23580 =
                      ((x10.array.Array<java.lang.String>)x$23574).$apply$G((int)(1));
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23663 = t23580;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23664 =
                      ret23663;
                    
//#line 942 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23658).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t23661)),
                                                                                                                                                                                                                                      ((java.lang.String)(t23664)));
                }
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23665 =
                  ((x10.array.Array)(kvs));
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23666 =
                  counter23684;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23667 =
                   null;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23619 =
                  p$23665;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23620 =
                  p$23666;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23621 =
                  ((x10.array.Array<java.lang.String>)x$23619).
                    rank;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23622 =
                  ((int) t23621) ==
                ((int) 1);
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23623 =
                  !(t23622);
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23623) {
                    
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23624 =
                      true;
                    
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23624) {
                        
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23625 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23625;
                    }
                }
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23626 =
                  ((x10.array.Array<java.lang.String>)x$23619).$apply$G((int)(x$i23620));
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23667 = t23626;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23668 =
                  ret23667;
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23669 =
                  (t23668).indexOf("LastLogin");
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23670 =
                  ((int) t23669) !=
                ((int) -1);
                
//#line 945 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23670) {
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23671 =
                      ((x10.array.Array)(kvs));
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23672 =
                      counter23684;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23673 =
                       null;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23581 =
                      p$23671;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23582 =
                      p$23672;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23583 =
                      ((x10.array.Array<java.lang.String>)x$23581).
                        rank;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23584 =
                      ((int) t23583) ==
                    ((int) 1);
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23585 =
                      !(t23584);
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23585) {
                        
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23586 =
                          true;
                        
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23586) {
                            
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23587 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23587;
                        }
                    }
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23588 =
                      ((x10.array.Array<java.lang.String>)x$23581).$apply$G((int)(x$i23582));
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23673 = t23588;
                    
//#line 946 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value23674 =
                      ret23673;
                    
//#line 947 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23675 =
                      value23674;
                    
//#line 947 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array strArr23676 =
                      x10.lang.StringHelper.split(":", t23675);
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t23677 =
                      result;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23678 =
                      ((x10.array.Array)(strArr23676));
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23679 =
                       null;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23589 =
                      p$23678;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23590 =
                      ((x10.array.Array<java.lang.String>)x$23589).
                        rank;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23591 =
                      ((int) t23590) ==
                    ((int) 1);
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23592 =
                      !(t23591);
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23592) {
                        
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23593 =
                          true;
                        
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23593) {
                            
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23594 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23594;
                        }
                    }
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23595 =
                      ((x10.array.Array<java.lang.String>)x$23589).$apply$G((int)(0));
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23679 = t23595;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23680 =
                      ret23679;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23681 =
                      ((x10.array.Array)(strArr23676));
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23682 =
                       null;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23596 =
                      p$23681;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23597 =
                      ((x10.array.Array<java.lang.String>)x$23596).
                        rank;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23598 =
                      ((int) t23597) ==
                    ((int) 1);
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23599 =
                      !(t23598);
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23599) {
                        
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23600 =
                          true;
                        
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23600) {
                            
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23601 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23601;
                        }
                    }
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23602 =
                      ((x10.array.Array<java.lang.String>)x$23596).$apply$G((int)(1));
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23682 = t23602;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23683 =
                      ret23682;
                    
//#line 948 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t23677).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t23680)),
                                                                                                                                                                                                                                      ((java.lang.String)(t23683)));
                }
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23685 =
                  i23687;
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23686 =
                  ((t23685) + (((int)(1))));
                
//#line 931 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23687 = t23686;
            }
            
//#line 952 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t22121 =
              resp;
            
//#line 952 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.net.URI location =
              t22121.getLocation();
            
//#line 954 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t22122 =
              resp;
            
//#line 954 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22123 =
              t22122.getStatus();
            
//#line 954 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22135 =
              ((int) t22123) ==
            ((int) 500);
            
//#line 954 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22135) {
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t22133 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22124 =
                  "Error : POST on ";
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22125 =
                  ((t22124) + (nodeEntryPoIntUri));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22127 =
                  ((t22125) + (", status code "));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t22126 =
                  resp;
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22128 =
                  t22126.getStatus();
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22129 =
                  ((t22127) + ((x10.core.Int.$box(t22128))));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22130 =
                  ((t22129) + (", location header "));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22131 =
                  location.toString();
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22132 =
                  ((t22130) + (t22131));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22134 =
                  ((t22132) + (""));
                
//#line 955 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22133.println(((java.lang.Object)(t22134)));
            }
            
//#line 958 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t22136 =
              resp;
            
//#line 958 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22136.close();
            
//#line 960 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t22137 =
              result;
            
//#line 960 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t22137;
        }
        
        
//#line 963 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public java.lang.String
                                                                                                             removeQuotes(
                                                                                                             java.lang.String input){
            
//#line 964 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22138 =
              input;
            
//#line 964 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22139 =
              (t22138).trim();
            
//#line 964 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
input = t22139;
            
//#line 965 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String result =
              null;
            
//#line 967 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22140 =
              input;
            
//#line 967 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int startInd =
              (t22140).indexOf("\"");
            
//#line 968 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22141 =
              input;
            
//#line 968 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int endInd =
              (t22141).lastIndexOf("\"");
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22142 =
              startInd;
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t22144 =
              ((t22142) >= (((int)(0))));
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22144) {
                
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22143 =
                  endInd;
                
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22144 = ((t22143) > (((int)(0))));
            }
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t22147 =
              t22144;
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22147) {
                
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22145 =
                  input;
                
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22146 =
                  (t22145).length();
                
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22147 = ((t22146) > (((int)(2))));
            }
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22161 =
              t22147;
            
//#line 970 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22161) {
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22151 =
                  input;
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22148 =
                  startInd;
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22152 =
                  ((t22148) + (((int)(1))));
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22149 =
                  endInd;
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22150 =
                  startInd;
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22153 =
                  ((t22149) - (((int)(t22150))));
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22154 =
                  (t22151).substring(((int)(t22152)), ((int)(t22153)));
                
//#line 971 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t22154;
            } else {
                
//#line 972 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22155 =
                  startInd;
                
//#line 972 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22156 =
                  endInd;
                
//#line 972 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22160 =
                  ((int) t22155) ==
                ((int) t22156);
                
//#line 972 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22160) {
                    
//#line 973 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22157 =
                      input;
                    
//#line 973 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22158 =
                      endInd;
                    
//#line 973 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22159 =
                      (t22157).substring(((int)(0)), ((int)(t22158)));
                    
//#line 973 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
result = t22159;
                }
            }
            
//#line 976 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22162 =
              result;
            
//#line 976 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return t22162;
        }
        
        
//#line 979 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public static int
                                                                                                             main__0$1x10$lang$String$2$O(
                                                                                                             final x10.array.Array<java.lang.String> args){
            
//#line 980 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t22163 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 980 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22165 =
              ((int) t22163) !=
            ((int) 1);
            
//#line 980 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22165) {
                
//#line 982 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.io.Printer t22164 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 982 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t22164.println(((java.lang.Object)("Please specify a threadcount")));
                
//#line 983 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return -1;
            }
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$20853 =
              ((x10.array.Array)(args));
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret20857 =
               null;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23693 =
              p$20853;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23694 =
              ((x10.array.Array<java.lang.String>)x$23693).
                rank;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23695 =
              ((int) t23694) ==
            ((int) 1);
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23696 =
              !(t23695);
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23696) {
                
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23697 =
                  true;
                
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23697) {
                    
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23698 =
                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                    
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23698;
                }
            }
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23699 =
              ((x10.array.Array<java.lang.String>)x$23693).$apply$G((int)(0));
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret20857 = t23699;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22172 =
              ret20857;
            
//#line 986 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int threadcount =
              java.lang.Integer.parseInt(t22172);
            
//#line 1030 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 1034 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                              traverse__2$1x10$lang$String$2$O(
                                                                                                              java.lang.String startkey,
                                                                                                              int levels,
                                                                                                              x10.util.ArrayList result){
            
//#line 1035 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.ArrayList unDiscoveredVertices =
              new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
            
//#line 1036 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.ArrayList discoveredVertices =
              new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
            
//#line 1039 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t22173 =
              unDiscoveredVertices;
            
//#line 1039 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22174 =
              startkey;
            
//#line 1039 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<java.lang.String>)t22173).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t22174)));
            
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20354min23828 =
              0;
            
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23829 =
              levels;
            
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20354max23830 =
              ((t23829) - (((int)(1))));
            
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23825 =
              i20354min23828;
            
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                     true;
                                                                                                                     ) {
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23826 =
                  i23825;
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23827 =
                  ((t23826) <= (((int)(i20354max23830))));
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23827)) {
                    
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                }
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i23822 =
                  i23825;
                
//#line 1042 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23808 =
                  unDiscoveredVertices;
                
//#line 1042 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ListIterator t23809 =
                  ((x10.util.ListIterator<java.lang.String>)
                    ((x10.util.ArrayList<java.lang.String>)t23808).iterator());
                
//#line 1042 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.lang.Iterator itr23810 =
                  ((x10.lang.Iterator<java.lang.String>)
                    t23809);
                
//#line 1044 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                    
//#line 1044 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t23811 =
                      itr23810;
                    
//#line 1044 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23812 =
                      ((x10.lang.Iterator<java.lang.String>)t23811).hasNext$O();
                    
//#line 1044 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23812)) {
                        
//#line 1044 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                    }
                    
//#line 1045 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t23766 =
                      itr23810;
                    
//#line 1045 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23767 =
                      ((x10.lang.Iterator<java.lang.String>)t23766).next$G();
                    
//#line 1045 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String k23768 =
                      (t23767).toString();
                    
//#line 1046 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23769 =
                      ((java.lang.String)(SERVER_ROOT_URI));
                    
//#line 1046 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23770 =
                      ((t23769) + ("/graphs/graph/tp/gremlin?script=g.V(\'pername\',\'"));
                    
//#line 1046 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23771 =
                      k23768;
                    
//#line 1046 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23772 =
                      ((t23770) + (t23771));
                    
//#line 1046 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String nodeEntryPoIntUri23773 =
                      ((t23772) + ("\').outE.gather.scatter.inV"));
                    
//#line 1048 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.Client t23774 =
                      com.sun.jersey.api.client.Client.create();
                    
//#line 1048 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.WebResource resource23775 =
                      t23774.resource(((java.lang.String)(nodeEntryPoIntUri23773)));
                    
//#line 1050 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
com.sun.jersey.api.client.ClientResponse resp23776 =
                      null;
                    
//#line 1052 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t23777 =
                      resp23776;
                    
//#line 1052 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.InputStream entityStream23778 =
                      t23777.getEntityInputStream();
                    
//#line 1054 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t23779 =
                      entityStream23778;
                    
//#line 1054 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStreamReader t23780 =
                      ((java.io.InputStreamReader)(new java.io.InputStreamReader(t23779)));
                    
//#line 1054 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.io.BufferedReader reader23781 =
                      new java.io.BufferedReader(((java.io.Reader)(t23780)));
                    
//#line 1055 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.StringBuilder builder23782 =
                      new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
                    
//#line 1056 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String line23783 =
                      null;
                    
//#line 1058 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int ch23784 =
                      -1;
                    
//#line 1059 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean appendFlag23785 =
                      false;
                    
//#line 1060 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean withinEntityFlag23786 =
                      false;
                    
//#line 1062 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                        
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                            
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.BufferedReader t23787 =
                              reader23781;
                            
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23788 =
                              t23787.read();
                            
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23789 =
                              ch23784 = t23788;
                            
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23790 =
                              ((int) t23789) !=
                            ((int) -1);
                            
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23790)) {
                                
//#line 1063 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                            }
                            
//#line 1064 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23744 =
                              ch23784;
                            
//#line 1064 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23745 =
                              ((int) t23744) ==
                            ((int) 91);
                            
//#line 1064 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23745) {
                                
//#line 1065 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag23785 = true;
                                
//#line 1066 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                            }
                            
//#line 1069 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23746 =
                              ch23784;
                            
//#line 1069 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23747 =
                              ((int) t23746) ==
                            ((int) 93);
                            
//#line 1069 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23747) {
                                
//#line 1070 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
appendFlag23785 = false;
                            }
                            
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23748 =
                              appendFlag23785;
                            
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23748) {
                                
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23749 =
                                  ch23784;
                                
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23748 = ((int) t23749) ==
                                ((int) 123);
                            }
                            
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23750 =
                              t23748;
                            
//#line 1073 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23750) {
                                
//#line 1074 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag23786 = true;
                                
//#line 1075 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23751 =
                                  ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
                                
//#line 1075 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
builder23782 = t23751;
                                
//#line 1076 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
continue;
                            }
                            
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23752 =
                              appendFlag23785;
                            
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23752) {
                                
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23753 =
                                  ch23784;
                                
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23752 = ((int) t23753) ==
                                ((int) 125);
                            }
                            
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23754 =
                              t23752;
                            
//#line 1079 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23754) {
                                
//#line 1080 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
withinEntityFlag23786 = false;
                                
//#line 1081 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23755 =
                                  builder23782;
                                
//#line 1081 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String entity23756 =
                                  t23755.toString();
                                
//#line 1083 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23757 =
                                  entity23756;
                                
//#line 1083 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array kvs23758 =
                                  x10.lang.StringHelper.split(",", t23757);
                                
//#line 1085 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t23759 =
                                  kvs23758;
                                
//#line 1085 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int len23760 =
                                  ((x10.array.Array<java.lang.String>)t23759).
                                    size;
                                
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20338min23741 =
                                  0;
                                
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23742 =
                                  len23760;
                                
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20338max23743 =
                                  ((t23742) - (((int)(1))));
                                
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i23738 =
                                  i20338min23741;
                                
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                                         true;
                                                                                                                                         ) {
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23739 =
                                      i23738;
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23740 =
                                      ((t23739) <= (((int)(i20338max23743))));
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23740)) {
                                        
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                                    }
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int counter23735 =
                                      i23738;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23716 =
                                      ((x10.array.Array)(kvs23758));
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23717 =
                                      counter23735;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23718 =
                                       null;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23708 =
                                      p$23716;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23709 =
                                      p$23717;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23710 =
                                      ((x10.array.Array<java.lang.String>)x$23708).
                                        rank;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23711 =
                                      ((int) t23710) ==
                                    ((int) 1);
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23712 =
                                      !(t23711);
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23712) {
                                        
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23713 =
                                          true;
                                        
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23713) {
                                            
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23714 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23714;
                                        }
                                    }
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23715 =
                                      ((x10.array.Array<java.lang.String>)x$23708).$apply$G((int)(x$i23709));
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23718 = t23715;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23719 =
                                      ret23718;
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23720 =
                                      (t23719).indexOf("pername");
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23721 =
                                      ((int) t23720) !=
                                    ((int) -1);
                                    
//#line 1088 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23721) {
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$23722 =
                                          ((x10.array.Array)(kvs23758));
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$23723 =
                                          counter23735;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret23724 =
                                           null;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23700 =
                                          p$23722;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i23701 =
                                          p$23723;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23702 =
                                          ((x10.array.Array<java.lang.String>)x$23700).
                                            rank;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23703 =
                                          ((int) t23702) ==
                                        ((int) 1);
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23704 =
                                          !(t23703);
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23704) {
                                            
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23705 =
                                              true;
                                            
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23705) {
                                                
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23706 =
                                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                                
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23706;
                                            }
                                        }
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23707 =
                                          ((x10.array.Array<java.lang.String>)x$23700).$apply$G((int)(x$i23701));
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret23724 = t23707;
                                        
//#line 1089 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String value23725 =
                                          ret23724;
                                        
//#line 1090 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23726 =
                                          value23725;
                                        
//#line 1090 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23727 =
                                          (t23726).indexOf(":");
                                        
//#line 1090 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int startInd23728 =
                                          ((t23727) + (((int)(1))));
                                        
//#line 1091 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23729 =
                                          value23725;
                                        
//#line 1091 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23730 =
                                          startInd23728;
                                        
//#line 1091 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23731 =
                                          (t23729).substring(((int)(t23730)));
                                        
//#line 1091 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String inV23732 =
                                          this.removeQuotes(((java.lang.String)(t23731)));
                                        
//#line 1093 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23733 =
                                          discoveredVertices;
                                        
//#line 1093 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23734 =
                                          inV23732;
                                        
//#line 1093 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<java.lang.String>)t23733).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t23734)));
                                    }
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23736 =
                                      i23738;
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23737 =
                                      ((t23736) + (((int)(1))));
                                    
//#line 1087 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23738 = t23737;
                                }
                            }
                            
//#line 1099 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
boolean t23761 =
                              appendFlag23785;
                            
//#line 1099 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23761) {
                                
//#line 1099 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23761 = withinEntityFlag23786;
                            }
                            
//#line 1099 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23762 =
                              t23761;
                            
//#line 1099 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23762) {
                                
//#line 1100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.StringBuilder t23763 =
                                  builder23782;
                                
//#line 1100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23764 =
                                  ch23784;
                                
//#line 1100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final char t23765 =
                                  ((char) (((int)(t23764))));
                                
//#line 1100 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23763.add((char)(t23765));
                            }
                        }
                    }}catch (java.io.IOException e23791) {
                        
//#line 1104 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t23792 =
                          e23791;
                        
//#line 1104 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23792.printStackTrace();
                    }finally {{
                         
//#line 1106 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                             
//#line 1107 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.InputStream t23793 =
                               entityStream23778;
                             
//#line 1107 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23793.close();
                         }}catch (java.io.IOException ec23794) {
                             
//#line 1109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.io.IOException t23795 =
                               ec23794;
                             
//#line 1109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23795.printStackTrace();
                         }
                     }}
                    
//#line 1113 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final com.sun.jersey.api.client.ClientResponse t23796 =
                      resp23776;
                    
//#line 1113 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t23796.close();
                    }
                
//#line 1117 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23813 =
                  discoveredVertices;
                
//#line 1117 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ListIterator t23814 =
                  ((x10.util.ListIterator<java.lang.String>)
                    ((x10.util.ArrayList<java.lang.String>)t23813).iterator());
                
//#line 1117 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.lang.Iterator itr23815 =
                  ((x10.lang.Iterator<java.lang.String>)
                    t23814);
                
//#line 1118 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String k23816 =
                  null;
                
//#line 1119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.ArrayList newUndiscoveredVertices23817 =
                  new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
                
//#line 1121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
while (true) {
                    
//#line 1121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t23818 =
                      itr23815;
                    
//#line 1121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23819 =
                      ((x10.lang.Iterator<java.lang.String>)t23818).hasNext$O();
                    
//#line 1121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t23819)) {
                        
//#line 1121 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                    }
                    
//#line 1122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.Iterator t23797 =
                      itr23815;
                    
//#line 1122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23798 =
                      ((x10.lang.Iterator<java.lang.String>)t23797).next$G();
                    
//#line 1122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23799 =
                      (t23798).toString();
                    
//#line 1122 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
k23816 = t23799;
                    
//#line 1124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23800 =
                      result;
                    
//#line 1124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23801 =
                      k23816;
                    
//#line 1124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23802 =
                      ((x10.util.ArrayList<java.lang.String>)t23800).contains__0x10$util$ArrayList$$T$O(((java.lang.String)(t23801)));
                    
//#line 1124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23803 =
                      !(t23802);
                    
//#line 1124 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23803) {
                        
//#line 1125 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23804 =
                          result;
                        
//#line 1125 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23805 =
                          k23816;
                        
//#line 1125 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<java.lang.String>)t23804).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t23805)));
                        
//#line 1126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23806 =
                          newUndiscoveredVertices23817;
                        
//#line 1126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23807 =
                          k23816;
                        
//#line 1126 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.ArrayList<java.lang.String>)t23806).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t23807)));
                    }
                }
                
//#line 1131 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23820 =
                  newUndiscoveredVertices23817;
                
//#line 1131 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
unDiscoveredVertices = t23820;
                
//#line 1132 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.ArrayList t23821 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S()));
                
//#line 1132 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
discoveredVertices = t23821;
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23823 =
                  i23825;
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23824 =
                  ((t23823) + (((int)(1))));
                
//#line 1041 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i23825 = t23824;
                }
            
//#line 1137 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return -1;
            }
        
        
//#line 1141 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public int
                                                                                                              insertEdge__2$1x10$lang$String$3x10$lang$String$2$O(
                                                                                                              java.lang.String table,
                                                                                                              java.lang.String key,
                                                                                                              x10.util.HashMap values){
            
//#line 1142 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22267 =
              table;
            
//#line 1142 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22268 =
              (t22267).equals("");
            
//#line 1142 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t22544 =
              !(t22268);
            
//#line 1142 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t22544) {
                
//#line 1143 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t22269 =
                  table;
                
//#line 1143 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array IntermArr =
                  x10.lang.StringHelper.split("<", t22269);
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20370min24214 =
                  0;
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t24215 =
                  IntermArr;
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24216 =
                  ((x10.array.Array<java.lang.String>)t24215).
                    size;
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int i20370max24217 =
                  ((t24216) - (((int)(1))));
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
int i24211 =
                  i20370min24214;
                
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24212 =
                      i24211;
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24213 =
                      ((t24212) <= (((int)(i20370max24217))));
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (!(t24213)) {
                        
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
break;
                    }
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int u24208 =
                      i24211;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24043 =
                      ((x10.array.Array)(IntermArr));
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$24044 =
                      u24208;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24045 =
                       null;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$24035 =
                      p$24043;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i24036 =
                      p$24044;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24037 =
                      ((x10.array.Array<java.lang.String>)x$24035).
                        rank;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24038 =
                      ((int) t24037) ==
                    ((int) 1);
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24039 =
                      !(t24038);
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24039) {
                        
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24040 =
                          true;
                        
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24040) {
                            
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24041 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24041;
                        }
                    }
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24042 =
                      ((x10.array.Array<java.lang.String>)x$24035).$apply$G((int)(x$i24036));
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24045 = t24042;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24046 =
                      ret24045;
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24047 =
                      (t24046).trim();
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24048 =
                      (t24047).equals("");
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24049 =
                      !(t24048);
                    
//#line 1147 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24049) {
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24050 =
                          ((x10.array.Array)(IntermArr));
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int p$24051 =
                          u24208;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24052 =
                           null;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$24020 =
                          p$24050;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int x$i24021 =
                          p$24051;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24022 =
                          ((x10.array.Array<java.lang.String>)x$24020).
                            rank;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24023 =
                          ((int) t24022) ==
                        ((int) 1);
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24024 =
                          !(t24023);
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24024) {
                            
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24025 =
                              true;
                            
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24025) {
                                
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24026 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24026;
                            }
                        }
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24027 =
                          ((x10.array.Array<java.lang.String>)x$24020).$apply$G((int)(x$i24021));
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24052 = t24027;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24053 =
                          ret24052;
                        
//#line 1148 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array inputArr24054 =
                          x10.lang.StringHelper.split("-", t24053);
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24055 =
                          ((x10.array.Array)(inputArr24054));
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24056 =
                           null;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$24028 =
                          p$24055;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24029 =
                          ((x10.array.Array<java.lang.String>)x$24028).
                            rank;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24030 =
                          ((int) t24029) ==
                        ((int) 1);
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24031 =
                          !(t24030);
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24031) {
                            
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24032 =
                              true;
                            
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24032) {
                                
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24033 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24033;
                            }
                        }
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24034 =
                          ((x10.array.Array<java.lang.String>)x$24028).$apply$G((int)(0));
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24056 = t24034;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24057 =
                          ret24056;
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24058 =
                          (t24057).equals("E");
                        
//#line 1150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24058) {
                            
//#line 1151 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String firstVertexName24059 =
                              null;
                            
//#line 1152 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String secondVertexName24060 =
                              null;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24061 =
                              ((x10.array.Array)(inputArr24054));
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24062 =
                               null;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23901 =
                              p$24061;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23902 =
                              ((x10.array.Array<java.lang.String>)x$23901).
                                rank;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23903 =
                              ((int) t23902) ==
                            ((int) 1);
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23904 =
                              !(t23903);
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23904) {
                                
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23905 =
                                  true;
                                
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23905) {
                                    
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23906 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23906;
                                }
                            }
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23907 =
                              ((x10.array.Array<java.lang.String>)x$23901).$apply$G((int)(1));
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24062 = t23907;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24063 =
                              ret24062;
                            
//#line 1153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array res24064 =
                              x10.lang.StringHelper.split(" ", t24063);
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24065 =
                              ((x10.array.Array)(res24064));
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24066 =
                               null;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23908 =
                              p$24065;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23909 =
                              ((x10.array.Array<java.lang.String>)x$23908).
                                rank;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23910 =
                              ((int) t23909) ==
                            ((int) 1);
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23911 =
                              !(t23910);
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23911) {
                                
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23912 =
                                  true;
                                
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23912) {
                                    
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23913 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23913;
                                }
                            }
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23914 =
                              ((x10.array.Array<java.lang.String>)x$23908).$apply$G((int)(0));
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24066 = t23914;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24067 =
                              ret24066;
                            
//#line 1155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert24068 =
                              x10.lang.StringHelper.split(",", t24067);
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24069 =
                              ((x10.array.Array)(res24064));
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24070 =
                               null;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23915 =
                              p$24069;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23916 =
                              ((x10.array.Array<java.lang.String>)x$23915).
                                rank;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23917 =
                              ((int) t23916) ==
                            ((int) 1);
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23918 =
                              !(t23917);
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23918) {
                                
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23919 =
                                  true;
                                
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23919) {
                                    
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23920 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23920;
                                }
                            }
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23921 =
                              ((x10.array.Array<java.lang.String>)x$23915).$apply$G((int)(1));
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24070 = t23921;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24071 =
                              ret24070;
                            
//#line 1156 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert24072 =
                              x10.lang.StringHelper.split(",", t24071);
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24073 =
                              ((x10.array.Array)(vert24068));
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24074 =
                               null;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23922 =
                              p$24073;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23923 =
                              ((x10.array.Array<java.lang.String>)x$23922).
                                rank;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23924 =
                              ((int) t23923) ==
                            ((int) 1);
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23925 =
                              !(t23924);
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23925) {
                                
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23926 =
                                  true;
                                
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23926) {
                                    
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23927 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23927;
                                }
                            }
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23928 =
                              ((x10.array.Array<java.lang.String>)x$23922).$apply$G((int)(0));
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24074 = t23928;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24075 =
                              ret24074;
                            
//#line 1158 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert24076 =
                              x10.lang.StringHelper.split(":", t24075);
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24077 =
                              ((x10.array.Array)(vert24076));
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24078 =
                               null;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23929 =
                              p$24077;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23930 =
                              ((x10.array.Array<java.lang.String>)x$23929).
                                rank;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23931 =
                              ((int) t23930) ==
                            ((int) 1);
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23932 =
                              !(t23931);
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23932) {
                                
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23933 =
                                  true;
                                
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23933) {
                                    
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23934 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23934;
                                }
                            }
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23935 =
                              ((x10.array.Array<java.lang.String>)x$23929).$apply$G((int)(0));
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24078 = t23935;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24079 =
                              ret24078;
                            
//#line 1160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String res24080 =
                              this.getVertexID(((java.lang.String)(t24079)));
                            
//#line 1162 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24081 =
                              res24080;
                            
//#line 1162 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24082 =
                              (t24081).equals("-1");
                            
//#line 1162 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24082) {
                                
//#line 1163 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs24083 =
                                  new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24084 =
                                  vertAttribs24083;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24085 =
                                  ((x10.array.Array)(vert24076));
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24086 =
                                   null;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23831 =
                                  p$24085;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23832 =
                                  ((x10.array.Array<java.lang.String>)x$23831).
                                    rank;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23833 =
                                  ((int) t23832) ==
                                ((int) 1);
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23834 =
                                  !(t23833);
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23834) {
                                    
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23835 =
                                      true;
                                    
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23835) {
                                        
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23836 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23836;
                                    }
                                }
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23837 =
                                  ((x10.array.Array<java.lang.String>)x$23831).$apply$G((int)(1));
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24086 = t23837;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24087 =
                                  ret24086;
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24088 =
                                  (t24087).toString();
                                
//#line 1164 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24084).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24088)));
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24089 =
                                  vertAttribs24083;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24090 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24091 =
                                   null;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23838 =
                                  p$24090;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23839 =
                                  ((x10.array.Array<java.lang.String>)x$23838).
                                    rank;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23840 =
                                  ((int) t23839) ==
                                ((int) 1);
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23841 =
                                  !(t23840);
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23841) {
                                    
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23842 =
                                      true;
                                    
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23842) {
                                        
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23843 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23843;
                                    }
                                }
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23844 =
                                  ((x10.array.Array<java.lang.String>)x$23838).$apply$G((int)(1));
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24091 = t23844;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24092 =
                                  ret24091;
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24093 =
                                  (t24092).toString();
                                
//#line 1165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24089).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24093)));
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24094 =
                                  vertAttribs24083;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24095 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24096 =
                                   null;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23845 =
                                  p$24095;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23846 =
                                  ((x10.array.Array<java.lang.String>)x$23845).
                                    rank;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23847 =
                                  ((int) t23846) ==
                                ((int) 1);
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23848 =
                                  !(t23847);
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23848) {
                                    
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23849 =
                                      true;
                                    
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23849) {
                                        
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23850 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23850;
                                    }
                                }
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23851 =
                                  ((x10.array.Array<java.lang.String>)x$23845).$apply$G((int)(2));
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24096 = t23851;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24097 =
                                  ret24096;
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24098 =
                                  (t24097).toString();
                                
//#line 1166 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24094).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24098)));
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24099 =
                                  vertAttribs24083;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24100 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24101 =
                                   null;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23852 =
                                  p$24100;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23853 =
                                  ((x10.array.Array<java.lang.String>)x$23852).
                                    rank;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23854 =
                                  ((int) t23853) ==
                                ((int) 1);
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23855 =
                                  !(t23854);
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23855) {
                                    
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23856 =
                                      true;
                                    
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23856) {
                                        
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23857 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23857;
                                    }
                                }
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23858 =
                                  ((x10.array.Array<java.lang.String>)x$23852).$apply$G((int)(3));
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24101 = t23858;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24102 =
                                  ret24101;
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24103 =
                                  (t24102).toString();
                                
//#line 1167 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24099).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24103)));
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24104 =
                                  vertAttribs24083;
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t24105 =
                                  ((java.util.Date)(new java.util.Date()));
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t24106 =
                                  t24105.getTime();
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t24107 =
                                  ((java.sql.Timestamp)(new java.sql.Timestamp(t24106)));
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24108 =
                                  t24107.toString();
                                
//#line 1168 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24104).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24108)));
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24109 =
                                  ((x10.array.Array)(vert24076));
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24110 =
                                   null;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23859 =
                                  p$24109;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23860 =
                                  ((x10.array.Array<java.lang.String>)x$23859).
                                    rank;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23861 =
                                  ((int) t23860) ==
                                ((int) 1);
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23862 =
                                  !(t23861);
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23862) {
                                    
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23863 =
                                      true;
                                    
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23863) {
                                        
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23864 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23864;
                                    }
                                }
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23865 =
                                  ((x10.array.Array<java.lang.String>)x$23859).$apply$G((int)(0));
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24110 = t23865;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24111 =
                                  ret24110;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24112 =
                                  vertAttribs24083;
                                
//#line 1170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t24111)),
                                                                                                                                                                                                           ((x10.util.HashMap)(t24112)));
                            }
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24113 =
                              ((x10.array.Array)(vert24076));
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24114 =
                               null;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23936 =
                              p$24113;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23937 =
                              ((x10.array.Array<java.lang.String>)x$23936).
                                rank;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23938 =
                              ((int) t23937) ==
                            ((int) 1);
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23939 =
                              !(t23938);
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23939) {
                                
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23940 =
                                  true;
                                
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23940) {
                                    
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23941 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23941;
                                }
                            }
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23942 =
                              ((x10.array.Array<java.lang.String>)x$23936).$apply$G((int)(0));
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24114 = t23942;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24115 =
                              ret24114;
                            
//#line 1173 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
firstVertexName24059 = t24115;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24116 =
                              ((x10.array.Array)(vert24072));
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24117 =
                               null;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23943 =
                              p$24116;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23944 =
                              ((x10.array.Array<java.lang.String>)x$23943).
                                rank;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23945 =
                              ((int) t23944) ==
                            ((int) 1);
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23946 =
                              !(t23945);
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23946) {
                                
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23947 =
                                  true;
                                
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23947) {
                                    
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23948 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23948;
                                }
                            }
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23949 =
                              ((x10.array.Array<java.lang.String>)x$23943).$apply$G((int)(0));
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24117 = t23949;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24118 =
                              ret24117;
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array t24119 =
                              ((x10.array.Array)(x10.lang.StringHelper.split(":", t24118)));
                            
//#line 1175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
vert24076 = t24119;
                            
//#line 1176 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.net.URI secondNode24120 =
                              null;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24121 =
                              ((x10.array.Array)(vert24076));
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24122 =
                               null;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23950 =
                              p$24121;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23951 =
                              ((x10.array.Array<java.lang.String>)x$23950).
                                rank;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23952 =
                              ((int) t23951) ==
                            ((int) 1);
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23953 =
                              !(t23952);
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23953) {
                                
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23954 =
                                  true;
                                
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23954) {
                                    
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23955 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23955;
                                }
                            }
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23956 =
                              ((x10.array.Array<java.lang.String>)x$23950).$apply$G((int)(0));
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24122 = t23956;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24123 =
                              ret24122;
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24124 =
                              this.getVertexID(((java.lang.String)(t24123)));
                            
//#line 1178 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
res24080 = t24124;
                            
//#line 1180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24125 =
                              res24080;
                            
//#line 1180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24126 =
                              (t24125).equals("-1");
                            
//#line 1180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24126) {
                                
//#line 1181 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs24127 =
                                  new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24128 =
                                  vertAttribs24127;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24129 =
                                  ((x10.array.Array)(vert24076));
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24130 =
                                   null;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23866 =
                                  p$24129;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23867 =
                                  ((x10.array.Array<java.lang.String>)x$23866).
                                    rank;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23868 =
                                  ((int) t23867) ==
                                ((int) 1);
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23869 =
                                  !(t23868);
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23869) {
                                    
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23870 =
                                      true;
                                    
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23870) {
                                        
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23871 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23871;
                                    }
                                }
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23872 =
                                  ((x10.array.Array<java.lang.String>)x$23866).$apply$G((int)(1));
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24130 = t23872;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24131 =
                                  ret24130;
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24132 =
                                  (t24131).toString();
                                
//#line 1182 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24128).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24132)));
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24133 =
                                  vertAttribs24127;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24134 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24135 =
                                   null;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23873 =
                                  p$24134;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23874 =
                                  ((x10.array.Array<java.lang.String>)x$23873).
                                    rank;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23875 =
                                  ((int) t23874) ==
                                ((int) 1);
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23876 =
                                  !(t23875);
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23876) {
                                    
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23877 =
                                      true;
                                    
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23877) {
                                        
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23878 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23878;
                                    }
                                }
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23879 =
                                  ((x10.array.Array<java.lang.String>)x$23873).$apply$G((int)(1));
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24135 = t23879;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24136 =
                                  ret24135;
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24137 =
                                  (t24136).toString();
                                
//#line 1183 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24133).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24137)));
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24138 =
                                  vertAttribs24127;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24139 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24140 =
                                   null;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23880 =
                                  p$24139;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23881 =
                                  ((x10.array.Array<java.lang.String>)x$23880).
                                    rank;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23882 =
                                  ((int) t23881) ==
                                ((int) 1);
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23883 =
                                  !(t23882);
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23883) {
                                    
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23884 =
                                      true;
                                    
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23884) {
                                        
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23885 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23885;
                                    }
                                }
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23886 =
                                  ((x10.array.Array<java.lang.String>)x$23880).$apply$G((int)(2));
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24140 = t23886;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24141 =
                                  ret24140;
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24142 =
                                  (t24141).toString();
                                
//#line 1184 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24138).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24142)));
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24143 =
                                  vertAttribs24127;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24144 =
                                  ((x10.array.Array)(vert24068));
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24145 =
                                   null;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23887 =
                                  p$24144;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23888 =
                                  ((x10.array.Array<java.lang.String>)x$23887).
                                    rank;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23889 =
                                  ((int) t23888) ==
                                ((int) 1);
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23890 =
                                  !(t23889);
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23890) {
                                    
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23891 =
                                      true;
                                    
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23891) {
                                        
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23892 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23892;
                                    }
                                }
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23893 =
                                  ((x10.array.Array<java.lang.String>)x$23887).$apply$G((int)(3));
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24145 = t23893;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24146 =
                                  ret24145;
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24147 =
                                  (t24146).toString();
                                
//#line 1185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24143).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24147)));
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24148 =
                                  vertAttribs24127;
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t24149 =
                                  ((java.util.Date)(new java.util.Date()));
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t24150 =
                                  t24149.getTime();
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t24151 =
                                  ((java.sql.Timestamp)(new java.sql.Timestamp(t24150)));
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24152 =
                                  t24151.toString();
                                
//#line 1186 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24148).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24152)));
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24153 =
                                  ((x10.array.Array)(vert24076));
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24154 =
                                   null;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23894 =
                                  p$24153;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23895 =
                                  ((x10.array.Array<java.lang.String>)x$23894).
                                    rank;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23896 =
                                  ((int) t23895) ==
                                ((int) 1);
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23897 =
                                  !(t23896);
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23897) {
                                    
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23898 =
                                      true;
                                    
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23898) {
                                        
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23899 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23899;
                                    }
                                }
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23900 =
                                  ((x10.array.Array<java.lang.String>)x$23894).$apply$G((int)(0));
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24154 = t23900;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24155 =
                                  ret24154;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24156 =
                                  vertAttribs24127;
                                
//#line 1188 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t24155)),
                                                                                                                                                                                                           ((x10.util.HashMap)(t24156)));
                            }
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24157 =
                              ((x10.array.Array)(vert24076));
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24158 =
                               null;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23957 =
                              p$24157;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23958 =
                              ((x10.array.Array<java.lang.String>)x$23957).
                                rank;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23959 =
                              ((int) t23958) ==
                            ((int) 1);
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23960 =
                              !(t23959);
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23960) {
                                
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23961 =
                                  true;
                                
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23961) {
                                    
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23962 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23962;
                                }
                            }
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23963 =
                              ((x10.array.Array<java.lang.String>)x$23957).$apply$G((int)(0));
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24158 = t23963;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24159 =
                              ret24158;
                            
//#line 1191 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
secondVertexName24060 = t24159;
                            
//#line 1193 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
try {{
                                
//#line 1197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24160 =
                                  firstVertexName24059;
                                
//#line 1197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24161 =
                                  secondVertexName24060;
                                
//#line 1197 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.addRelationship(((java.lang.String)(t24160)),
                                                                                                                                                         ((java.lang.String)(t24161)),
                                                                                                                                                         ((java.lang.String)("affiliated")));
                            }}catch (java.lang.RuntimeException e24162) {
                                
//#line 1199 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.RuntimeException t24163 =
                                  e24162;
                                
//#line 1199 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
t24163.printStackTrace();
                                
//#line 1200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return -1;
                            }
                        } else {
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24164 =
                              ((x10.array.Array)(inputArr24054));
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24165 =
                               null;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23999 =
                              p$24164;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24000 =
                              ((x10.array.Array<java.lang.String>)x$23999).
                                rank;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24001 =
                              ((int) t24000) ==
                            ((int) 1);
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24002 =
                              !(t24001);
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24002) {
                                
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24003 =
                                  true;
                                
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24003) {
                                    
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24004 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24004;
                                }
                            }
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24005 =
                              ((x10.array.Array<java.lang.String>)x$23999).$apply$G((int)(1));
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24165 = t24005;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24166 =
                              ret24165;
                            
//#line 1205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert24167 =
                              x10.lang.StringHelper.split(",", t24166);
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24168 =
                              ((x10.array.Array)(vert24167));
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24169 =
                               null;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$24006 =
                              p$24168;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24007 =
                              ((x10.array.Array<java.lang.String>)x$24006).
                                rank;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24008 =
                              ((int) t24007) ==
                            ((int) 1);
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24009 =
                              !(t24008);
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24009) {
                                
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24010 =
                                  true;
                                
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24010) {
                                    
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24011 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24011;
                                }
                            }
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24012 =
                              ((x10.array.Array<java.lang.String>)x$24006).$apply$G((int)(0));
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24169 = t24012;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24170 =
                              ret24169;
                            
//#line 1206 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.array.Array vert24171 =
                              x10.lang.StringHelper.split(":", t24170);
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24172 =
                              ((x10.array.Array)(vert24171));
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24173 =
                               null;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$24013 =
                              p$24172;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24014 =
                              ((x10.array.Array<java.lang.String>)x$24013).
                                rank;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24015 =
                              ((int) t24014) ==
                            ((int) 1);
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24016 =
                              !(t24015);
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24016) {
                                
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24017 =
                                  true;
                                
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24017) {
                                    
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t24018 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                    
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t24018;
                                }
                            }
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24019 =
                              ((x10.array.Array<java.lang.String>)x$24013).$apply$G((int)(0));
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24173 = t24019;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24174 =
                              ret24173;
                            
//#line 1207 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String res24175 =
                              this.getVertexID(((java.lang.String)(t24174)));
                            
//#line 1209 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24176 =
                              res24175;
                            
//#line 1209 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t24177 =
                              (t24176).equals("-1");
                            
//#line 1209 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t24177) {
                                
//#line 1210 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
x10.util.HashMap vertAttribs24178 =
                                  new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24179 =
                                  vertAttribs24178;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24180 =
                                  ((x10.array.Array)(vert24171));
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24181 =
                                   null;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23964 =
                                  p$24180;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23965 =
                                  ((x10.array.Array<java.lang.String>)x$23964).
                                    rank;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23966 =
                                  ((int) t23965) ==
                                ((int) 1);
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23967 =
                                  !(t23966);
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23967) {
                                    
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23968 =
                                      true;
                                    
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23968) {
                                        
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23969 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23969;
                                    }
                                }
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23970 =
                                  ((x10.array.Array<java.lang.String>)x$23964).$apply$G((int)(1));
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24181 = t23970;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24182 =
                                  ret24181;
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24183 =
                                  (t24182).toString();
                                
//#line 1211 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24179).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib1")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24183)));
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24184 =
                                  vertAttribs24178;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24185 =
                                  ((x10.array.Array)(vert24167));
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24186 =
                                   null;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23971 =
                                  p$24185;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23972 =
                                  ((x10.array.Array<java.lang.String>)x$23971).
                                    rank;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23973 =
                                  ((int) t23972) ==
                                ((int) 1);
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23974 =
                                  !(t23973);
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23974) {
                                    
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23975 =
                                      true;
                                    
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23975) {
                                        
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23976 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23976;
                                    }
                                }
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23977 =
                                  ((x10.array.Array<java.lang.String>)x$23971).$apply$G((int)(1));
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24186 = t23977;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24187 =
                                  ret24186;
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24188 =
                                  (t24187).toString();
                                
//#line 1212 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24184).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib2")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24188)));
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24189 =
                                  vertAttribs24178;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24190 =
                                  ((x10.array.Array)(vert24167));
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24191 =
                                   null;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23978 =
                                  p$24190;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23979 =
                                  ((x10.array.Array<java.lang.String>)x$23978).
                                    rank;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23980 =
                                  ((int) t23979) ==
                                ((int) 1);
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23981 =
                                  !(t23980);
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23981) {
                                    
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23982 =
                                      true;
                                    
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23982) {
                                        
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23983 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23983;
                                    }
                                }
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23984 =
                                  ((x10.array.Array<java.lang.String>)x$23978).$apply$G((int)(2));
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24191 = t23984;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24192 =
                                  ret24191;
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24193 =
                                  (t24192).toString();
                                
//#line 1213 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24189).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib3")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24193)));
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24194 =
                                  vertAttribs24178;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24195 =
                                  ((x10.array.Array)(vert24167));
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24196 =
                                   null;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23985 =
                                  p$24195;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23986 =
                                  ((x10.array.Array<java.lang.String>)x$23985).
                                    rank;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23987 =
                                  ((int) t23986) ==
                                ((int) 1);
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23988 =
                                  !(t23987);
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23988) {
                                    
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23989 =
                                      true;
                                    
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23989) {
                                        
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23990 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23990;
                                    }
                                }
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23991 =
                                  ((x10.array.Array<java.lang.String>)x$23985).$apply$G((int)(3));
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24196 = t23991;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24197 =
                                  ret24196;
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24198 =
                                  (t24197).toString();
                                
//#line 1214 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24194).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("attrib4")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24198)));
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24199 =
                                  vertAttribs24178;
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.util.Date t24200 =
                                  ((java.util.Date)(new java.util.Date()));
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final long t24201 =
                                  t24200.getTime();
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.sql.Timestamp t24202 =
                                  ((java.sql.Timestamp)(new java.sql.Timestamp(t24201)));
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24203 =
                                  t24202.toString();
                                
//#line 1215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t24199).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)("LastLogin")),
                                                                                                                                                                                                                                                   ((java.lang.String)(t24203)));
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array p$24204 =
                                  ((x10.array.Array)(vert24171));
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
java.lang.String ret24205 =
                                   null;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.array.Array x$23992 =
                                  p$24204;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t23993 =
                                  ((x10.array.Array<java.lang.String>)x$23992).
                                    rank;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23994 =
                                  ((int) t23993) ==
                                ((int) 1);
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23995 =
                                  !(t23994);
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23995) {
                                    
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final boolean t23996 =
                                      true;
                                    
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
if (t23996) {
                                        
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.lang.FailedDynamicCheckException t23997 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
throw t23997;
                                    }
                                }
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t23998 =
                                  ((x10.array.Array<java.lang.String>)x$23992).$apply$G((int)(0));
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
ret24205 = t23998;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final java.lang.String t24206 =
                                  ret24205;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final x10.util.HashMap t24207 =
                                  vertAttribs24178;
                                
//#line 1217 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.createVertexWithProperties__1$1x10$lang$String$3x10$lang$String$2(((java.lang.String)(t24206)),
                                                                                                                                                                                                           ((x10.util.HashMap)(t24207)));
                            }
                        }
                    }
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24209 =
                      i24211;
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final int t24210 =
                      ((t24209) + (((int)(1))));
                    
//#line 1145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
i24211 = t24210;
                }
            }
            
//#line 1223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return 0;
        }
        
        
//#line 1226 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public static boolean
                                                                                                              call_createVertexIndex$O(
                                                                                                              final java.lang.String id$5,
                                                                                                              final java.lang.String id$6){try {return org.xgdbench.java.TitanClient_Java.createVertexIndex(id$5, id$6);}
        catch (java.lang.Throwable exc$34569) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$34569);
        }
        }
        
        
        
//#line 1229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public static java.lang.String
                                                                                                              call_getVertexID(
                                                                                                              final java.lang.String id$7,
                                                                                                              final java.lang.String id$8,
                                                                                                              final java.lang.String id$9){try {return org.xgdbench.java.TitanClient_Java.getVertexID(id$7, id$8, id$9);}
        catch (java.lang.Throwable exc$34570) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$34570);
        }
        }
        
        
        
//#line 1232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public static java.lang.String
                                                                                                              call_createVertexWithProperties(
                                                                                                              final java.lang.String id$10,
                                                                                                              final java.lang.String id$11,
                                                                                                              final java.lang.String id$12,
                                                                                                              final java.lang.String id$13){try {return org.xgdbench.java.TitanClient_Java.createVertexWithProperties(id$10, id$11, id$12, id$13);}
        catch (java.lang.Throwable exc$34571) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$34571);
        }
        }
        
        
        
//#line 1236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
public static java.lang.String
                                                                                                              call_addRelationship(
                                                                                                              final java.lang.String id$14,
                                                                                                              final java.lang.String id$15,
                                                                                                              final java.lang.String id$16,
                                                                                                              final java.lang.String id$17,
                                                                                                              final java.lang.String id$18){try {return org.xgdbench.java.TitanClient_Java.addRelationship(id$14, id$15, id$16, id$17, id$18);}
        catch (java.lang.Throwable exc$34572) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$34572);
        }
        }
        
        
        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public org.xgdbench.TitanClient
                                                                                                            org$xgdbench$TitanClient$$this$org$xgdbench$TitanClient(
                                                                                                            ){
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
return org.xgdbench.TitanClient.this;
        }
        
        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
final public void
                                                                                                            __fieldInitializers17791(
                                                                                                            ){
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.SERVER_ROOT_URI = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.transactInsert = false;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.inOutNeighbourCount = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.vertexAttribs = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.newVertexQueue = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.sumDegree = 0L;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.largestVert = 0L;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.largestNewVert = 0L;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.totalOpCount = 0L;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.transactInsertOpCount = 0L;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.affMatrix = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.mag = null;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.thetaThreshold = 0.1F;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.attribCount = 0;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.threadCount = 0;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.insertProportion = 0.0F;
            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/db/titan/src/org/xgdbench/TitanClient.x10"
this.indexName = "vindex";
        }
        
        }
        
        