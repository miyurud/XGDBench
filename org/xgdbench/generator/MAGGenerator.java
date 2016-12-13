package org.xgdbench.generator;


@x10.runtime.impl.java.X10Generated public class MAGGenerator extends com.yahoo.ycsb.generator.Generator implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAGGenerator> $RTT = x10.rtt.NamedType.<MAGGenerator> make(
    "org.xgdbench.generator.MAGGenerator", /* base class */MAGGenerator.class
    , /* parents */ new x10.rtt.Type[] {com.yahoo.ycsb.generator.Generator.$RTT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAGGenerator $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAGGenerator.class + " calling"); } 
        com.yahoo.ycsb.generator.Generator.$_deserialize_body($_obj, $deserializer);
        $_obj._lastvalue = $deserializer.readRef();
        $_obj.res = $deserializer.readRef();
        $_obj.vertexA = $deserializer.readInt();
        $_obj.vertexB = $deserializer.readInt();
        $_obj.curVertexID = $deserializer.readInt();
        $_obj.nVertices = $deserializer.readInt();
        $_obj.nEdges = $deserializer.readInt();
        $_obj.randomSeed = $deserializer.readInt();
        $_obj.attribLen = $deserializer.readInt();
        $_obj.vertexCounter = $deserializer.readInt();
        $_obj.entityCount = $deserializer.readLong();
        $_obj.unitOperation = $deserializer.readInt();
        $_obj.gotNextEdge = $deserializer.readBoolean();
        $_obj.threadCount = $deserializer.readInt();
        $_obj.threadCntr = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAGGenerator $_obj = new MAGGenerator((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        super.$_serialize($serializer);
        $serializer.write(this._lastvalue);
        if (res instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.res);
        } else {
        $serializer.write(this.res);
        }
        $serializer.write(this.vertexA);
        $serializer.write(this.vertexB);
        $serializer.write(this.curVertexID);
        $serializer.write(this.nVertices);
        $serializer.write(this.nEdges);
        $serializer.write(this.randomSeed);
        $serializer.write(this.attribLen);
        $serializer.write(this.vertexCounter);
        $serializer.write(this.entityCount);
        $serializer.write(this.unitOperation);
        $serializer.write(this.gotNextEdge);
        $serializer.write(this.threadCount);
        $serializer.write(this.threadCntr);
        
    }
    
    // constructor just for allocation
    public MAGGenerator(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 18 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public java.lang.String _lastvalue;
        
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public org.xgdbench.generator.MAGResult res;
        
//#line 20 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int vertexA;
        
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int vertexB;
        
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int curVertexID;
        
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int nVertices;
        
//#line 24 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int nEdges;
        
//#line 25 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int randomSeed;
        
//#line 26 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int attribLen;
        
//#line 27 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int vertexCounter;
        
//#line 28 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public long entityCount;
        
//#line 29 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int unitOperation;
        
//#line 30 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public boolean gotNextEdge;
        
//#line 31 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int threadCount;
        
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int threadCntr;
        
        
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
// creation method for java code (1-phase java constructor)
        public MAGGenerator(){this((java.lang.System[]) null);
                                  org$xgdbench$generator$MAGGenerator$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.MAGGenerator org$xgdbench$generator$MAGGenerator$$init$S() { {
                                                                                                                
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
/*super.*/com$yahoo$ycsb$generator$Generator$$init$S();
                                                                                                                
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"

                                                                                                                
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.__fieldInitializers28142();
                                                                                                                
//#line 35 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.vertexCounter = 0;
                                                                                                                
//#line 36 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nVertices = 1000;
                                                                                                                
//#line 37 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.randomSeed = 100;
                                                                                                                
//#line 38 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int nAttributes =
                                                                                                                  4;
                                                                                                                
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int attribThreshold =
                                                                                                                  40;
                                                                                                                
//#line 40 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
float pThreshold =
                                                                                                                  0.1F;
                                                                                                                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x10.array.Array theta =
                                                                                                                  x10.runtime.impl.java.ArrayUtils.<x10.core.Float> makeArrayFromJavaArray(x10.rtt.Types.FLOAT, new float[] {0.99F, 0.53F, 0.53F, 0.13F});
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28533 =
                                                                                                                  nVertices;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28534 =
                                                                                                                  nAttributes;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28535 =
                                                                                                                  attribThreshold;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final float t28536 =
                                                                                                                  pThreshold;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array t28537 =
                                                                                                                  theta;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28538 =
                                                                                                                  threadCount;
                                                                                                                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAG mg =
                                                                                                                  new org.xgdbench.generator.MAG((java.lang.System[]) null).org$xgdbench$generator$MAG$$init$S(t28533,
                                                                                                                                                                                                               t28534,
                                                                                                                                                                                                               t28535,
                                                                                                                                                                                                               t28536,
                                                                                                                                                                                                               t28537,
                                                                                                                                                                                                               t28538, (org.xgdbench.generator.MAG.__4$1x10$lang$Float$2) null);
                                                                                                                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAG t28539 =
                                                                                                                  mg;
                                                                                                                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28540 =
                                                                                                                  randomSeed;
                                                                                                                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28541 =
                                                                                                                  t28539.run((int)(t28540));
                                                                                                                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.res = ((org.xgdbench.generator.MAGResult)(t28541));
                                                                                                                
//#line 44 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28542 =
                                                                                                                  nAttributes;
                                                                                                                
//#line 44 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.attribLen = t28542;
                                                                                                                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAG t28543 =
                                                                                                                  mg;
                                                                                                                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28544 =
                                                                                                                  t28543.getEntityCount$O();
                                                                                                                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.entityCount = t28544;
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28546 =
                                                                                                                  entityCount;
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28545 =
                                                                                                                  nVertices;
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28547 =
                                                                                                                  ((long)(((int)(t28545))));
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28548 =
                                                                                                                  ((t28546) / (((long)(t28547))));
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28549 =
                                                                                                                  ((int)(long)(((long)(t28548))));
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28550 =
                                                                                                                  ((t28549) + (((int)(1))));
                                                                                                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.unitOperation = t28550;
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28552 =
                                                                                                                  entityCount;
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28551 =
                                                                                                                  nVertices;
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28553 =
                                                                                                                  ((long)(((int)(t28551))));
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28554 =
                                                                                                                  ((t28552) - (((long)(t28553))));
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28555 =
                                                                                                                  ((int)(long)(((long)(t28554))));
                                                                                                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nEdges = t28555;
                                                                                                            }
                                                                                                            return this;
                                                                                                            }
        
        
        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
// creation method for java code (1-phase java constructor)
        public MAGGenerator(int nAttributes,
                            int nVertices,
                            x10.array.Array<x10.core.Float> theta,
                            float pThreshold,
                            int randomSeed,
                            int threadCount, __2$1x10$lang$Float$2 $dummy){this((java.lang.System[]) null);
                                                                               org$xgdbench$generator$MAGGenerator$$init$S(nAttributes,nVertices,theta,pThreshold,randomSeed,threadCount, (org.xgdbench.generator.MAGGenerator.__2$1x10$lang$Float$2) null);}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.MAGGenerator org$xgdbench$generator$MAGGenerator$$init$S(int nAttributes,
                                                                                                     int nVertices,
                                                                                                     x10.array.Array<x10.core.Float> theta,
                                                                                                     float pThreshold,
                                                                                                     int randomSeed,
                                                                                                     int threadCount, __2$1x10$lang$Float$2 $dummy) { {
                                                                                                                                                             
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
/*super.*/com$yahoo$ycsb$generator$Generator$$init$S();
                                                                                                                                                             
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"

                                                                                                                                                             
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.__fieldInitializers28142();
                                                                                                                                                             
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28556 =
                                                                                                                                                               nVertices;
                                                                                                                                                             
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nVertices = t28556;
                                                                                                                                                             
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int attribThreshold =
                                                                                                                                                               40;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28557 =
                                                                                                                                                               nVertices;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28558 =
                                                                                                                                                               nAttributes;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28559 =
                                                                                                                                                               attribThreshold;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final float t28560 =
                                                                                                                                                               pThreshold;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array t28561 =
                                                                                                                                                               theta;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28562 =
                                                                                                                                                               threadCount;
                                                                                                                                                             
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAG mg =
                                                                                                                                                               new org.xgdbench.generator.MAG((java.lang.System[]) null).org$xgdbench$generator$MAG$$init$S(t28557,
                                                                                                                                                                                                                                                            t28558,
                                                                                                                                                                                                                                                            t28559,
                                                                                                                                                                                                                                                            t28560,
                                                                                                                                                                                                                                                            t28561,
                                                                                                                                                                                                                                                            t28562, (org.xgdbench.generator.MAG.__4$1x10$lang$Float$2) null);
                                                                                                                                                             
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAG t28563 =
                                                                                                                                                               mg;
                                                                                                                                                             
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28564 =
                                                                                                                                                               randomSeed;
                                                                                                                                                             
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28565 =
                                                                                                                                                               t28563.run((int)(t28564));
                                                                                                                                                             
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.res = ((org.xgdbench.generator.MAGResult)(t28565));
                                                                                                                                                             
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28566 =
                                                                                                                                                               nAttributes;
                                                                                                                                                             
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.attribLen = t28566;
                                                                                                                                                             
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAG t28567 =
                                                                                                                                                               mg;
                                                                                                                                                             
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28568 =
                                                                                                                                                               t28567.getEntityCount$O();
                                                                                                                                                             
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.entityCount = t28568;
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28570 =
                                                                                                                                                               entityCount;
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28569 =
                                                                                                                                                               nVertices;
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28571 =
                                                                                                                                                               ((long)(((int)(t28569))));
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28572 =
                                                                                                                                                               ((t28570) / (((long)(t28571))));
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28573 =
                                                                                                                                                               ((int)(long)(((long)(t28572))));
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28574 =
                                                                                                                                                               ((t28573) + (((int)(1))));
                                                                                                                                                             
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.unitOperation = t28574;
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28576 =
                                                                                                                                                               entityCount;
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28575 =
                                                                                                                                                               nVertices;
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28577 =
                                                                                                                                                               ((long)(((int)(t28575))));
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28578 =
                                                                                                                                                               ((t28576) - (((long)(t28577))));
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28579 =
                                                                                                                                                               ((int)(long)(((long)(t28578))));
                                                                                                                                                             
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nEdges = t28579;
                                                                                                                                                             
//#line 61 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28580 =
                                                                                                                                                               threadCount;
                                                                                                                                                             
//#line 61 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.threadCount = t28580;
                                                                                                                                                             
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28581 =
                                                                                                                                                               ((java.lang.String)(org.xgdbench.util.Conts.XGDBENCH_LOGGER_NAME));
                                                                                                                                                             
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.apache.log4j.Logger t28583 =
                                                                                                                                                               org.apache.log4j.Logger.getLogger(((java.lang.String)(t28581)));
                                                                                                                                                             
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28582 =
                                                                                                                                                               entityCount;
                                                                                                                                                             
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28584 =
                                                                                                                                                               (("Total entity count : ") + ((x10.core.Long.$box(t28582))));
                                                                                                                                                             
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28583.info(((java.lang.Object)(t28584)));
                                                                                                                                                             
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28585 =
                                                                                                                                                               ((java.lang.String)(org.xgdbench.util.Conts.XGDBENCH_LOGGER_NAME));
                                                                                                                                                             
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.apache.log4j.Logger t28587 =
                                                                                                                                                               org.apache.log4j.Logger.getLogger(((java.lang.String)(t28585)));
                                                                                                                                                             
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28586 =
                                                                                                                                                               unitOperation;
                                                                                                                                                             
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28588 =
                                                                                                                                                               (("unitOperation : ") + ((x10.core.Int.$box(t28586))));
                                                                                                                                                             
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28587.info(((java.lang.Object)(t28588)));
                                                                                                                                                             
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28589 =
                                                                                                                                                               ((java.lang.String)(org.xgdbench.util.Conts.XGDBENCH_LOGGER_NAME));
                                                                                                                                                             
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.apache.log4j.Logger t28591 =
                                                                                                                                                               org.apache.log4j.Logger.getLogger(((java.lang.String)(t28589)));
                                                                                                                                                             
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28590 =
                                                                                                                                                               nVertices;
                                                                                                                                                             
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28592 =
                                                                                                                                                               (("nVertices count : ") + ((x10.core.Int.$box(t28590))));
                                                                                                                                                             
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28591.info(((java.lang.Object)(t28592)));
                                                                                                                                                             
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28593 =
                                                                                                                                                               ((java.lang.String)(org.xgdbench.util.Conts.XGDBENCH_LOGGER_NAME));
                                                                                                                                                             
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.apache.log4j.Logger t28595 =
                                                                                                                                                               org.apache.log4j.Logger.getLogger(((java.lang.String)(t28593)));
                                                                                                                                                             
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28594 =
                                                                                                                                                               nEdges;
                                                                                                                                                             
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28596 =
                                                                                                                                                               (("nEdges count : ") + ((x10.core.Int.$box(t28594))));
                                                                                                                                                             
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28595.info(((java.lang.Object)(t28596)));
                                                                                                                                                         }
                                                                                                                                                         return this;
                                                                                                                                                         }
        
        
        
//#line 69 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public long
                                                                                                              getEntityCount$O(
                                                                                                              ){
            
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final long t28597 =
              entityCount;
            
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28597;
        }
        
        
//#line 78 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public java.lang.String
                                                                                                              nextString(
                                                                                                              ){
            
//#line 79 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x10.util.StringBuilder nextStr =
              new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
            
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28598 =
              attribLen;
            
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int attribLenOneBefore =
              ((t28598) - (((int)(1))));
            
//#line 81 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int k =
              0;
            
//#line 86 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28599 =
              vertexCounter;
            
//#line 86 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28600 =
              nVertices;
            
//#line 86 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28633 =
              ((t28599) < (((int)(t28600))));
            
//#line 86 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28633) {
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28601 =
                  nextStr;
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28601.add(((java.lang.String)("<")));
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28602 =
                  nextStr;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28602.add(((java.lang.String)("V-")));
                
//#line 89 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28603 =
                  nextStr;
                
//#line 89 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28604 =
                  vertexCounter;
                
//#line 89 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28603.add((int)(t28604));
                
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28605 =
                  nextStr;
                
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28605.add(((java.lang.String)(":")));
                
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28322min28854 =
                  0;
                
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28855 =
                  attribLenOneBefore;
                
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28322max28856 =
                  ((t28855) - (((int)(1))));
                
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i28851 =
                  i28322min28854;
                
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28852 =
                      i28851;
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28853 =
                      ((t28852) <= (((int)(i28322max28856))));
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (!(t28853)) {
                        
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
break;
                    }
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int k28848 =
                      i28851;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28840 =
                      nextStr;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28841 =
                      ((org.xgdbench.generator.MAGResult)(res));
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28842 =
                      ((x10.array.Array)(t28841.
                                           nodesAttribs));
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28843 =
                      vertexCounter;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28844 =
                      k28848;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28845 =
                       0;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28831 =
                      p$28842;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28832 =
                      p$28843;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28833 =
                      p$28844;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28834 =
                      ((x10.array.Array<x10.core.Byte>)x$28831).
                        rank;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28835 =
                      ((int) t28834) ==
                    ((int) 2);
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28836 =
                      !(t28835);
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28836) {
                        
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28837 =
                          true;
                        
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28837) {
                            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28838 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                            
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28838;
                        }
                    }
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28839 =
                      x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28831).$apply$G((int)(x$i28832),
                                                                                              (int)(x$i28833)));
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28845 = t28839;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28846 =
                      ret28845;
                    
//#line 93 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28840.add((byte)(t28846));
                    
//#line 94 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28847 =
                      nextStr;
                    
//#line 94 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28847.add(((java.lang.String)(",")));
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28849 =
                      i28851;
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28850 =
                      ((t28849) + (((int)(1))));
                    
//#line 92 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i28851 = t28850;
                }
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28629 =
                  nextStr;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28622 =
                  ((org.xgdbench.generator.MAGResult)(res));
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28409 =
                  ((x10.array.Array)(t28622.
                                       nodesAttribs));
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28410 =
                  vertexCounter;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28411 =
                  k;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28415 =
                   0;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28857 =
                  p$28409;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28858 =
                  p$28410;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28859 =
                  p$28411;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28860 =
                  ((x10.array.Array<x10.core.Byte>)x$28857).
                    rank;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28861 =
                  ((int) t28860) ==
                ((int) 2);
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28862 =
                  !(t28861);
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28862) {
                    
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28863 =
                      true;
                    
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28863) {
                        
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28864 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                        
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28864;
                    }
                }
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28865 =
                  x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28857).$apply$G((int)(x$i28858),
                                                                                          (int)(x$i28859)));
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28415 = t28865;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28630 =
                  ret28415;
                
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28629.add((byte)(t28630));
                
//#line 99 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGGenerator x28417 =
                  ((org.xgdbench.generator.MAGGenerator)(this));
                
//#line 99 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                
//#line 99 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28631 =
                  x28417.
                    vertexCounter;
                
//#line 99 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28632 =
                  ((t28631) + (((int)(1))));
                
//#line 99 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x28417.vertexCounter = t28632;
            }
            
//#line 151 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28634 =
              nextStr;
            
//#line 151 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28635 =
              t28634.toString();
            
//#line 151 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this._lastvalue = ((java.lang.String)(t28635));
            
//#line 153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28636 =
              ((java.lang.String)(_lastvalue));
            
//#line 153 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28636;
        }
        
        
//#line 160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public java.lang.String
                                                                                                               nextEdgeString(
                                                                                                               ){
            
//#line 161 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x10.util.StringBuilder nextStr =
              new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
            
//#line 162 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28637 =
              attribLen;
            
//#line 162 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int attribLenOneBefore =
              ((t28637) - (((int)(1))));
            
//#line 163 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i =
              0;
            
//#line 163 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int j =
              0;
            
//#line 163 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int k =
              0;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28638 =
              ((org.xgdbench.generator.MAGResult)(res));
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28419 =
              ((x10.array.Array)(t28638.
                                   edges));
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28420 =
              threadCntr;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAGThread ret28423 =
               null;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29058 =
              p$28419;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29059 =
              p$28420;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29060 =
              ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29058).
                rank;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29061 =
              ((int) t29060) ==
            ((int) 1);
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29062 =
              !(t29061);
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29062) {
                
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29063 =
                  true;
                
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29063) {
                    
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29064 =
                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                    
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29064;
                }
            }
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t29065 =
              ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29058).$apply$G((int)(x$i29059));
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28423 = t29065;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t28645 =
              ret28423;
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28822 =
              t28645.hasNextEdge$O();
            
//#line 222 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28822) {
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28646 =
                  ((org.xgdbench.generator.MAGResult)(res));
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28425 =
                  ((x10.array.Array)(t28646.
                                       edges));
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28426 =
                  threadCntr;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAGThread ret28429 =
                   null;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28912 =
                  p$28425;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28913 =
                  p$28426;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28914 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$28912).
                    rank;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28915 =
                  ((int) t28914) ==
                ((int) 1);
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28916 =
                  !(t28915);
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28916) {
                    
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28917 =
                      true;
                    
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28917) {
                        
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28918 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28918;
                    }
                }
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t28919 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$28912).$apply$G((int)(x$i28913));
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28429 = t28919;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t28653 =
                  ret28429;
                
//#line 223 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x10.array.Array vertArr =
                  t28653.nextEdge();
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28431 =
                  ((x10.array.Array)(vertArr));
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int ret28435 =
                   0;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28920 =
                  p$28431;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28921 =
                  ((x10.array.Array<x10.core.Int>)x$28920).
                    rank;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28922 =
                  ((int) t28921) ==
                ((int) 1);
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28923 =
                  !(t28922);
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28923) {
                    
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28924 =
                      true;
                    
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28924) {
                        
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28925 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28925;
                    }
                }
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28926 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$28920).$apply$G((int)(0)));
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28435 = t28926;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28660 =
                  ret28435;
                
//#line 224 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i = t28660;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28437 =
                  ((x10.array.Array)(vertArr));
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int ret28441 =
                   0;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28927 =
                  p$28437;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28928 =
                  ((x10.array.Array<x10.core.Int>)x$28927).
                    rank;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28929 =
                  ((int) t28928) ==
                ((int) 1);
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28930 =
                  !(t28929);
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28930) {
                    
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28931 =
                      true;
                    
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28931) {
                        
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28932 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28932;
                    }
                }
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28933 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$28927).$apply$G((int)(1)));
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28441 = t28933;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28667 =
                  ret28441;
                
//#line 225 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
j = t28667;
                
//#line 227 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28668 =
                  nextStr;
                
//#line 227 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28668.add(((java.lang.String)("<")));
                
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28669 =
                  nextStr;
                
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28669.add(((java.lang.String)("E-")));
                
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28670 =
                  nextStr;
                
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28671 =
                  i;
                
//#line 229 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28670.add((int)(t28671));
                
//#line 230 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28672 =
                  nextStr;
                
//#line 230 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28672.add(((java.lang.String)(":")));
                
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28338min28934 =
                  0;
                
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28935 =
                  attribLenOneBefore;
                
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28338max28936 =
                  ((t28935) - (((int)(1))));
                
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i28886 =
                  i28338min28934;
                
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28887 =
                      i28886;
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28888 =
                      ((t28887) <= (((int)(i28338max28936))));
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (!(t28888)) {
                        
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
break;
                    }
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int k28883 =
                      i28886;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28875 =
                      nextStr;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28876 =
                      ((org.xgdbench.generator.MAGResult)(res));
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28877 =
                      ((x10.array.Array)(t28876.
                                           nodesAttribs));
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28878 =
                      i;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28879 =
                      k28883;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28880 =
                       0;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28866 =
                      p$28877;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28867 =
                      p$28878;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28868 =
                      p$28879;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28869 =
                      ((x10.array.Array<x10.core.Byte>)x$28866).
                        rank;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28870 =
                      ((int) t28869) ==
                    ((int) 2);
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28871 =
                      !(t28870);
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28871) {
                        
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28872 =
                          true;
                        
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28872) {
                            
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28873 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                            
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28873;
                        }
                    }
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28874 =
                      x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28866).$apply$G((int)(x$i28867),
                                                                                              (int)(x$i28868)));
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28880 = t28874;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28881 =
                      ret28880;
                    
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28875.add((byte)(t28881));
                    
//#line 233 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28882 =
                      nextStr;
                    
//#line 233 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28882.add(((java.lang.String)(",")));
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28884 =
                      i28886;
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28885 =
                      ((t28884) + (((int)(1))));
                    
//#line 231 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i28886 = t28885;
                }
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28696 =
                  nextStr;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28689 =
                  ((org.xgdbench.generator.MAGResult)(res));
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28451 =
                  ((x10.array.Array)(t28689.
                                       nodesAttribs));
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28452 =
                  i;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28453 =
                  k;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28457 =
                   0;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28937 =
                  p$28451;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28938 =
                  p$28452;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28939 =
                  p$28453;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28940 =
                  ((x10.array.Array<x10.core.Byte>)x$28937).
                    rank;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28941 =
                  ((int) t28940) ==
                ((int) 2);
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28942 =
                  !(t28941);
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28942) {
                    
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28943 =
                      true;
                    
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28943) {
                        
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28944 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                        
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28944;
                    }
                }
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28945 =
                  x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28937).$apply$G((int)(x$i28938),
                                                                                          (int)(x$i28939)));
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28457 = t28945;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28697 =
                  ret28457;
                
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28696.add((byte)(t28697));
                
//#line 237 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28698 =
                  nextStr;
                
//#line 237 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28698.add(((java.lang.String)(" ")));
                
//#line 240 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28699 =
                  nextStr;
                
//#line 240 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28700 =
                  j;
                
//#line 240 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28699.add((int)(t28700));
                
//#line 241 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28701 =
                  nextStr;
                
//#line 241 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28701.add(((java.lang.String)(":")));
                
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28354min28946 =
                  0;
                
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28947 =
                  attribLenOneBefore;
                
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28354max28948 =
                  ((t28947) - (((int)(1))));
                
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i28909 =
                  i28354min28946;
                
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28910 =
                      i28909;
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28911 =
                      ((t28910) <= (((int)(i28354max28948))));
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (!(t28911)) {
                        
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
break;
                    }
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int k28906 =
                      i28909;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28898 =
                      nextStr;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28899 =
                      ((org.xgdbench.generator.MAGResult)(res));
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28900 =
                      ((x10.array.Array)(t28899.
                                           nodesAttribs));
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28901 =
                      j;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28902 =
                      k28906;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28903 =
                       0;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28889 =
                      p$28900;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28890 =
                      p$28901;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28891 =
                      p$28902;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28892 =
                      ((x10.array.Array<x10.core.Byte>)x$28889).
                        rank;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28893 =
                      ((int) t28892) ==
                    ((int) 2);
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28894 =
                      !(t28893);
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28894) {
                        
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28895 =
                          true;
                        
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28895) {
                            
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28896 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                            
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28896;
                        }
                    }
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28897 =
                      x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28889).$apply$G((int)(x$i28890),
                                                                                              (int)(x$i28891)));
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28903 = t28897;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28904 =
                      ret28903;
                    
//#line 243 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28898.add((byte)(t28904));
                    
//#line 244 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28905 =
                      nextStr;
                    
//#line 244 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28905.add(((java.lang.String)(",")));
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28907 =
                      i28909;
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28908 =
                      ((t28907) + (((int)(1))));
                    
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i28909 = t28908;
                }
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28725 =
                  nextStr;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28718 =
                  ((org.xgdbench.generator.MAGResult)(res));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28467 =
                  ((x10.array.Array)(t28718.
                                       nodesAttribs));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28468 =
                  j;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28469 =
                  k;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28473 =
                   0;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28949 =
                  p$28467;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28950 =
                  p$28468;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28951 =
                  p$28469;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28952 =
                  ((x10.array.Array<x10.core.Byte>)x$28949).
                    rank;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28953 =
                  ((int) t28952) ==
                ((int) 2);
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28954 =
                  !(t28953);
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28954) {
                    
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28955 =
                      true;
                    
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28955) {
                        
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28956 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                        
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28956;
                    }
                }
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28957 =
                  x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28949).$apply$G((int)(x$i28950),
                                                                                          (int)(x$i28951)));
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28473 = t28957;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28726 =
                  ret28473;
                
//#line 247 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28725.add((byte)(t28726));
            } else {
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28727 =
                  threadCount;
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28728 =
                  threadCntr;
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28821 =
                  ((t28727) < (((int)(t28728))));
                
//#line 249 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28821) {
                    
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGGenerator x28475 =
                      ((org.xgdbench.generator.MAGGenerator)(this));
                    
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                    
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28729 =
                      x28475.
                        threadCntr;
                    
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28730 =
                      ((t28729) + (((int)(1))));
                    
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x28475.threadCntr = t28730;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28731 =
                      ((org.xgdbench.generator.MAGResult)(res));
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28477 =
                      ((x10.array.Array)(t28731.
                                           edges));
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28478 =
                      threadCntr;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAGThread ret28481 =
                       null;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29050 =
                      p$28477;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29051 =
                      p$28478;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29052 =
                      ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29050).
                        rank;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29053 =
                      ((int) t29052) ==
                    ((int) 1);
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29054 =
                      !(t29053);
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29054) {
                        
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29055 =
                          true;
                        
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29055) {
                            
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29056 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29056;
                        }
                    }
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t29057 =
                      ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29050).$apply$G((int)(x$i29051));
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28481 = t29057;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t28738 =
                      ret28481;
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28820 =
                      t28738.hasNextEdge$O();
                    
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28820) {
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28739 =
                          ((org.xgdbench.generator.MAGResult)(res));
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28483 =
                          ((x10.array.Array)(t28739.
                                               edges));
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28484 =
                          threadCntr;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
org.xgdbench.generator.MAGThread ret28487 =
                           null;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29004 =
                          p$28483;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29005 =
                          p$28484;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29006 =
                          ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29004).
                            rank;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29007 =
                          ((int) t29006) ==
                        ((int) 1);
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29008 =
                          !(t29007);
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29008) {
                            
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29009 =
                              true;
                            
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29009) {
                                
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29010 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29010;
                            }
                        }
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t29011 =
                          ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29004).$apply$G((int)(x$i29005));
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28487 = t29011;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGThread t28746 =
                          ret28487;
                        
//#line 253 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
x10.array.Array vertArr =
                          t28746.nextEdge();
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28489 =
                          ((x10.array.Array)(vertArr));
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int ret28493 =
                           0;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29012 =
                          p$28489;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29013 =
                          ((x10.array.Array<x10.core.Int>)x$29012).
                            rank;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29014 =
                          ((int) t29013) ==
                        ((int) 1);
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29015 =
                          !(t29014);
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29015) {
                            
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29016 =
                              true;
                            
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29016) {
                                
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29017 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29017;
                            }
                        }
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29018 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$29012).$apply$G((int)(0)));
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28493 = t29018;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28753 =
                          ret28493;
                        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i = t28753;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28495 =
                          ((x10.array.Array)(vertArr));
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int ret28499 =
                           0;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29019 =
                          p$28495;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29020 =
                          ((x10.array.Array<x10.core.Int>)x$29019).
                            rank;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29021 =
                          ((int) t29020) ==
                        ((int) 1);
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29022 =
                          !(t29021);
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29022) {
                            
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29023 =
                              true;
                            
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29023) {
                                
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29024 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29024;
                            }
                        }
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29025 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$29019).$apply$G((int)(1)));
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28499 = t29025;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28760 =
                          ret28499;
                        
//#line 255 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
j = t28760;
                        
//#line 257 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28761 =
                          nextStr;
                        
//#line 257 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28761.add(((java.lang.String)("<")));
                        
//#line 258 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28762 =
                          nextStr;
                        
//#line 258 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28762.add(((java.lang.String)("E-")));
                        
//#line 259 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28763 =
                          nextStr;
                        
//#line 259 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28764 =
                          i;
                        
//#line 259 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28763.add((int)(t28764));
                        
//#line 260 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28765 =
                          nextStr;
                        
//#line 260 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28765.add(((java.lang.String)(":")));
                        
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28370min29026 =
                          0;
                        
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29027 =
                          attribLenOneBefore;
                        
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28370max29028 =
                          ((t29027) - (((int)(1))));
                        
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i28978 =
                          i28370min29026;
                        
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28979 =
                              i28978;
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28980 =
                              ((t28979) <= (((int)(i28370max29028))));
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (!(t28980)) {
                                
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
break;
                            }
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int k28975 =
                              i28978;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28967 =
                              nextStr;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28968 =
                              ((org.xgdbench.generator.MAGResult)(res));
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28969 =
                              ((x10.array.Array)(t28968.
                                                   nodesAttribs));
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28970 =
                              i;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28971 =
                              k28975;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28972 =
                               0;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28958 =
                              p$28969;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28959 =
                              p$28970;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28960 =
                              p$28971;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28961 =
                              ((x10.array.Array<x10.core.Byte>)x$28958).
                                rank;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28962 =
                              ((int) t28961) ==
                            ((int) 2);
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28963 =
                              !(t28962);
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28963) {
                                
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28964 =
                                  true;
                                
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28964) {
                                    
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28965 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                    
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28965;
                                }
                            }
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28966 =
                              x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28958).$apply$G((int)(x$i28959),
                                                                                                      (int)(x$i28960)));
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28972 = t28966;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28973 =
                              ret28972;
                            
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28967.add((byte)(t28973));
                            
//#line 263 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28974 =
                              nextStr;
                            
//#line 263 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28974.add(((java.lang.String)(",")));
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28976 =
                              i28978;
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28977 =
                              ((t28976) + (((int)(1))));
                            
//#line 261 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i28978 = t28977;
                        }
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28789 =
                          nextStr;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28782 =
                          ((org.xgdbench.generator.MAGResult)(res));
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28509 =
                          ((x10.array.Array)(t28782.
                                               nodesAttribs));
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28510 =
                          i;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28511 =
                          k;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28515 =
                           0;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29029 =
                          p$28509;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29030 =
                          p$28510;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29031 =
                          p$28511;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29032 =
                          ((x10.array.Array<x10.core.Byte>)x$29029).
                            rank;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29033 =
                          ((int) t29032) ==
                        ((int) 2);
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29034 =
                          !(t29033);
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29034) {
                            
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29035 =
                              true;
                            
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29035) {
                                
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29036 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29036;
                            }
                        }
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t29037 =
                          x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29029).$apply$G((int)(x$i29030),
                                                                                                  (int)(x$i29031)));
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28515 = t29037;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28790 =
                          ret28515;
                        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28789.add((byte)(t28790));
                        
//#line 267 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28791 =
                          nextStr;
                        
//#line 267 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28791.add(((java.lang.String)(" ")));
                        
//#line 270 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28792 =
                          nextStr;
                        
//#line 270 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28793 =
                          j;
                        
//#line 270 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28792.add((int)(t28793));
                        
//#line 271 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28794 =
                          nextStr;
                        
//#line 271 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28794.add(((java.lang.String)(":")));
                        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28386min29038 =
                          0;
                        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29039 =
                          attribLenOneBefore;
                        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int i28386max29040 =
                          ((t29039) - (((int)(1))));
                        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
int i29001 =
                          i28386min29038;
                        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29002 =
                              i29001;
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29003 =
                              ((t29002) <= (((int)(i28386max29040))));
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (!(t29003)) {
                                
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
break;
                            }
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int k28998 =
                              i29001;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28990 =
                              nextStr;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28991 =
                              ((org.xgdbench.generator.MAGResult)(res));
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28992 =
                              ((x10.array.Array)(t28991.
                                                   nodesAttribs));
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28993 =
                              j;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28994 =
                              k28998;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28995 =
                               0;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$28981 =
                              p$28992;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28982 =
                              p$28993;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i28983 =
                              p$28994;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28984 =
                              ((x10.array.Array<x10.core.Byte>)x$28981).
                                rank;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28985 =
                              ((int) t28984) ==
                            ((int) 2);
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28986 =
                              !(t28985);
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28986) {
                                
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28987 =
                                  true;
                                
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28987) {
                                    
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t28988 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                    
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t28988;
                                }
                            }
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28989 =
                              x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$28981).$apply$G((int)(x$i28982),
                                                                                                      (int)(x$i28983)));
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28995 = t28989;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28996 =
                              ret28995;
                            
//#line 273 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28990.add((byte)(t28996));
                            
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28997 =
                              nextStr;
                            
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28997.add(((java.lang.String)(",")));
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28999 =
                              i29001;
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29000 =
                              ((t28999) + (((int)(1))));
                            
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
i29001 = t29000;
                        }
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28818 =
                          nextStr;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final org.xgdbench.generator.MAGResult t28811 =
                          ((org.xgdbench.generator.MAGResult)(res));
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array p$28525 =
                          ((x10.array.Array)(t28811.
                                               nodesAttribs));
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28526 =
                          j;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int p$28527 =
                          k;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
byte ret28531 =
                           0;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.array.Array x$29041 =
                          p$28525;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29042 =
                          p$28526;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int x$i29043 =
                          p$28527;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t29044 =
                          ((x10.array.Array<x10.core.Byte>)x$29041).
                            rank;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29045 =
                          ((int) t29044) ==
                        ((int) 2);
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29046 =
                          !(t29045);
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29046) {
                            
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t29047 =
                              true;
                            
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t29047) {
                                
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.lang.FailedDynamicCheckException t29048 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
throw t29048;
                            }
                        }
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t29049 =
                          x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29041).$apply$G((int)(x$i29042),
                                                                                                  (int)(x$i29043)));
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
ret28531 = t29049;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final byte t28819 =
                          ret28531;
                        
//#line 277 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
t28818.add((byte)(t28819));
                    }
                }
            }
            
//#line 282 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final x10.util.StringBuilder t28823 =
              nextStr;
            
//#line 282 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28824 =
              t28823.toString();
            
//#line 282 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28824;
        }
        
        
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public boolean
                                                                                                               gotNextEdge$O(
                                                                                                               ){
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28825 =
              gotNextEdge;
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28825;
        }
        
        
//#line 298 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public java.lang.String
                                                                                                               lastString(
                                                                                                               ){
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28826 =
              ((java.lang.String)(_lastvalue));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final boolean t28828 =
              ((t28826) == (null));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
if (t28828) {
                
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28827 =
                  this.nextString();
                
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this._lastvalue = ((java.lang.String)(t28827));
            }
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final java.lang.String t28829 =
              ((java.lang.String)(_lastvalue));
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28829;
        }
        
        
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
public int
                                                                                                               getEdgeCount$O(
                                                                                                               ){
            
//#line 307 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final int t28830 =
              nEdges;
            
//#line 307 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return t28830;
        }
        
        
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final public org.xgdbench.generator.MAGGenerator
                                                                                                              org$xgdbench$generator$MAGGenerator$$this$org$xgdbench$generator$MAGGenerator(
                                                                                                              ){
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
return org.xgdbench.generator.MAGGenerator.this;
        }
        
        
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
final public void
                                                                                                              __fieldInitializers28142(
                                                                                                              ){
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this._lastvalue = null;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.res = null;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.vertexA = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.vertexB = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.curVertexID = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nVertices = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.nEdges = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.randomSeed = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.attribLen = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.vertexCounter = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.entityCount = 0L;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.unitOperation = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.gotNextEdge = true;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.threadCount = 0;
            
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGGenerator.x10"
this.threadCntr = 0;
        }
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Float$2 {}
    
}

