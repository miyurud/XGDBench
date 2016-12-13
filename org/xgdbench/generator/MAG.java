package org.xgdbench.generator;


@x10.runtime.impl.java.X10Generated public class MAG extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAG> $RTT = x10.rtt.NamedType.<MAG> make(
    "org.xgdbench.generator.MAG", /* base class */MAG.class
    
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAG $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAG.class + " calling"); } 
        $_obj.nVertices = $deserializer.readInt();
        $_obj.nEdges = $deserializer.readInt();
        $_obj.nAttributes = $deserializer.readInt();
        $_obj.attribThreshold = $deserializer.readInt();
        $_obj.pThreshold = $deserializer.readFloat();
        $_obj.theta = $deserializer.readRef();
        $_obj.result = $deserializer.readFloat();
        $_obj.threadCount = $deserializer.readInt();
        $_obj.threadArr = $deserializer.readRef();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAG $_obj = new MAG((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.nVertices);
        $serializer.write(this.nEdges);
        $serializer.write(this.nAttributes);
        $serializer.write(this.attribThreshold);
        $serializer.write(this.pThreshold);
        if (theta instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.theta);
        } else {
        $serializer.write(this.theta);
        }
        $serializer.write(this.result);
        $serializer.write(this.threadCount);
        if (threadArr instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.threadArr);
        } else {
        $serializer.write(this.threadArr);
        }
        
    }
    
    // constructor just for allocation
    public MAG(final java.lang.System[] $dummy) { 
    }
    
        
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public int nVertices;
        
//#line 11 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public int nEdges;
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public int nAttributes;
        
//#line 13 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public int attribThreshold;
        
//#line 14 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public float pThreshold;
        
//#line 15 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public x10.array.Array<x10.core.Float> theta;
        
//#line 16 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public float result;
        
//#line 18 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public int threadCount;
        
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public x10.array.Array<org.xgdbench.generator.MAGThread> threadArr;
        
        
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
// creation method for java code (1-phase java constructor)
        public MAG(int nVertices,
                   int nAttributes,
                   int attribThreshold,
                   float pThreshold,
                   x10.array.Array<x10.core.Float> theta,
                   int threadCount, __4$1x10$lang$Float$2 $dummy){this((java.lang.System[]) null);
                                                                      org$xgdbench$generator$MAG$$init$S(nVertices,nAttributes,attribThreshold,pThreshold,theta,threadCount, (org.xgdbench.generator.MAG.__4$1x10$lang$Float$2) null);}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.MAG org$xgdbench$generator$MAG$$init$S(int nVertices,
                                                                                   int nAttributes,
                                                                                   int attribThreshold,
                                                                                   float pThreshold,
                                                                                   x10.array.Array<x10.core.Float> theta,
                                                                                   int threadCount, __4$1x10$lang$Float$2 $dummy) { {
                                                                                                                                           
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
;
                                                                                                                                           
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"

                                                                                                                                           
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.__fieldInitializers29610();
                                                                                                                                           
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29820 =
                                                                                                                                             nVertices;
                                                                                                                                           
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.nVertices = t29820;
                                                                                                                                           
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29821 =
                                                                                                                                             nAttributes;
                                                                                                                                           
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.nAttributes = t29821;
                                                                                                                                           
//#line 24 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29822 =
                                                                                                                                             attribThreshold;
                                                                                                                                           
//#line 24 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.attribThreshold = t29822;
                                                                                                                                           
//#line 25 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final float t29823 =
                                                                                                                                             pThreshold;
                                                                                                                                           
//#line 25 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.pThreshold = t29823;
                                                                                                                                           
//#line 26 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29824 =
                                                                                                                                             theta;
                                                                                                                                           
//#line 26 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.theta = ((x10.array.Array)(t29824));
                                                                                                                                           
//#line 27 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29825 =
                                                                                                                                             threadCount;
                                                                                                                                           
//#line 27 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.threadCount = t29825;
                                                                                                                                           
//#line 28 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29826 =
                                                                                                                                             threadCount;
                                                                                                                                           
//#line 28 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29827 =
                                                                                                                                             ((x10.array.Array)(new x10.array.Array<org.xgdbench.generator.MAGThread>((java.lang.System[]) null, org.xgdbench.generator.MAGThread.$RTT).x10$array$Array$$init$S(t29826)));
                                                                                                                                           
//#line 28 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.threadArr = ((x10.array.Array)(t29827));
                                                                                                                                       }
                                                                                                                                       return this;
                                                                                                                                       }
        
        
        
//#line 31 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public org.xgdbench.generator.MAGResult
                                                                                                     run(
                                                                                                     int randomSeed){
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
org.xgdbench.generator.MAGResult result1 =
              new org.xgdbench.generator.MAGResult((java.lang.System[]) null).org$xgdbench$generator$MAGResult$$init$S();
            
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29828 =
              nVertices;
            
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.IntRange t29830 =
              ((x10.lang.IntRange)(new x10.lang.IntRange((java.lang.System[]) null).x10$lang$IntRange$$init$S(((int)(0)), ((int)(t29828)))));
            
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29829 =
              nAttributes;
            
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.IntRange t29831 =
              ((x10.lang.IntRange)(new x10.lang.IntRange((java.lang.System[]) null).x10$lang$IntRange$$init$S(((int)(0)), ((int)(t29829)))));
            
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Region region =
              ((x10.array.Region)(t29830.$times(((x10.lang.IntRange)(t29831)))));
            
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.core.fun.Fun_0_1 t29833 =
              ((x10.core.fun.Fun_0_1)(new org.xgdbench.generator.MAG.$Closure$2()));
            
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
x10.array.Array nodesAttribs =
              new x10.array.Array<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE).x10$array$Array$$init$S(((x10.array.Region)(region)),
                                                                                                                        ((x10.core.fun.Fun_0_1)(t29833)), (x10.array.Array.__1$1x10$array$Point$3x10$array$Array$$T$2) null);
            
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29834 =
              randomSeed;
            
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final long t29835 =
              ((long)(((int)(t29834))));
            
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
java.util.Random ran =
              new java.util.Random(t29835);
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29719min30055 =
              0;
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30056 =
              nVertices;
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29719max30057 =
              ((t30056) - (((int)(1))));
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int i29967 =
              i29719min30055;
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
for (;
                                                                                                            true;
                                                                                                            ) {
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29968 =
                  i29967;
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29969 =
                  ((t29968) <= (((int)(i29719max30057))));
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (!(t29969)) {
                    
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
break;
                }
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29964 =
                  i29967;
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29703min29961 =
                  0;
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29962 =
                  nAttributes;
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29703max29963 =
                  ((t29962) - (((int)(1))));
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int i29958 =
                  i29703min29961;
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
for (;
                                                                                                                true;
                                                                                                                ) {
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29959 =
                      i29958;
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29960 =
                      ((t29959) <= (((int)(i29703max29963))));
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (!(t29960)) {
                        
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
break;
                    }
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int j29955 =
                      i29958;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array p$29944 =
                      ((x10.array.Array)(nodesAttribs));
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$29945 =
                      i29964;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$29946 =
                      j29955;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final java.util.Random t29947 =
                      ran;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29948 =
                      t29947.nextInt((int)(100));
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29949 =
                      attribThreshold;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29950 =
                      ((t29948) > (((int)(t29949))));
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int t29951 =
                       0;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29950) {
                        
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t29951 = 1;
                    } else {
                        
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t29951 = 0;
                    }
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29952 =
                      t29951;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final byte p$29953 =
                      ((byte)(int)(((int)(t29952))));
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
byte ret29954 =
                       0;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array x$29934 =
                      p$29944;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i29935 =
                      p$29945;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i29936 =
                      p$29946;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final byte x$v29937 =
                      p$29953;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29938 =
                      ((x10.array.Array<x10.core.Byte>)x$29934).
                        rank;
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29939 =
                      ((int) t29938) ==
                    ((int) 2);
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29940 =
                      !(t29939);
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29940) {
                        
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29941 =
                          true;
                        
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29941) {
                            
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.FailedDynamicCheckException t29942 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                            
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
throw t29942;
                        }
                    }
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final byte t29943 =
                      x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29934).$set__2x10$array$Array$$T$G((int)(x$i29935),
                                                                                                                 (int)(x$i29936),
                                                                                                                 x10.core.Byte.$box(x$v29937)));
                    
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
ret29954 = t29943;
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29956 =
                      i29958;
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29957 =
                      ((t29956) + (((int)(1))));
                    
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
i29958 = t29957;
                }
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29965 =
                  i29967;
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29966 =
                  ((t29965) + (((int)(1))));
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
i29967 = t29966;
            }
            
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29860 =
              nVertices;
            
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29861 =
              threadCount;
            
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29862 =
              ((t29860) / (((int)(t29861))));
            
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final double t29863 =
              ((double)(int)(((int)(t29862))));
            
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
double factor =
              java.lang.Math.round(((double)(t29863)));
            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int start =
              0;
            
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final double t29864 =
              factor;
            
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int end =
              ((int)(double)(((double)(t29864))));
            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29735min30058 =
              0;
            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30059 =
              threadCount;
            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29735max30060 =
              ((t30059) - (((int)(1))));
            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int i30010 =
              i29735min30058;
            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
for (;
                                                                                                            true;
                                                                                                            ) {
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30011 =
                  i30010;
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30012 =
                  ((t30011) <= (((int)(i29735max30060))));
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (!(t30012)) {
                    
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
break;
                }
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i30007 =
                  i30010;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array p$29987 =
                  ((x10.array.Array)(threadArr));
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$29988 =
                  i30007;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29989 =
                  nVertices;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29990 =
                  nAttributes;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29991 =
                  nodesAttribs;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29992 =
                  ((x10.array.Array)(theta));
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final float t29993 =
                  pThreshold;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29994 =
                  start;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29995 =
                  end;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread p$29996 =
                  ((org.xgdbench.generator.MAGThread)(new org.xgdbench.generator.MAGThread(t29989,
                                                                                           t29990,
                                                                                           t29991,
                                                                                           t29992,
                                                                                           t29993,
                                                                                           t29994,
                                                                                           t29995, (org.xgdbench.generator.MAGThread.__2$1x10$lang$Byte$2__3$1x10$lang$Float$2) null)));
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
org.xgdbench.generator.MAGThread ret29997 =
                   null;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array x$29970 =
                  p$29987;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i29971 =
                  p$29988;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread x$v29972 =
                  p$29996;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29973 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29970).
                    rank;
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29974 =
                  ((int) t29973) ==
                ((int) 1);
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29975 =
                  !(t29974);
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29975) {
                    
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29976 =
                      true;
                    
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29976) {
                        
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.FailedDynamicCheckException t29977 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
throw t29977;
                    }
                }
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t29978 =
                  ((org.xgdbench.generator.MAGThread)(((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29970).$set__1x10$array$Array$$T$G((int)(x$i29971),
                                                                                                                                               ((org.xgdbench.generator.MAGThread)(x$v29972)))));
                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
ret29997 = ((org.xgdbench.generator.MAGThread)(t29978));
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array p$29998 =
                  ((x10.array.Array)(threadArr));
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$29999 =
                  i30007;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
org.xgdbench.generator.MAGThread ret30000 =
                   null;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array x$29979 =
                  p$29998;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i29980 =
                  p$29999;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29981 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29979).
                    rank;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29982 =
                  ((int) t29981) ==
                ((int) 1);
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29983 =
                  !(t29982);
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29983) {
                    
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t29984 =
                      true;
                    
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t29984) {
                        
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.FailedDynamicCheckException t29985 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
throw t29985;
                    }
                }
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t29986 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$29979).$apply$G((int)(x$i29980));
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
ret30000 = t29986;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t30001 =
                  ret30000;
                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t30001.start();
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30002 =
                  end;
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
start = t30002;
                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30003 =
                  end;
                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final double t30004 =
                  ((double)(int)(((int)(t30003))));
                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final double t30005 =
                  factor;
                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final double t30006 =
                  ((t30004) + (((double)(t30005))));
                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
end = ((int)(((double)(t30006))));
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30008 =
                  i30010;
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30009 =
                  ((t30008) + (((int)(1))));
                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
i30010 = t30009;
            }
            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29751min30061 =
              0;
            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30062 =
              threadCount;
            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29751max30063 =
              ((t30062) - (((int)(1))));
            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int i30030 =
              i29751min30061;
            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
for (;
                                                                                                            true;
                                                                                                            ) {
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30031 =
                  i30030;
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30032 =
                  ((t30031) <= (((int)(i29751max30063))));
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (!(t30032)) {
                    
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
break;
                }
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i30027 =
                  i30030;
                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
try {{
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array p$30021 =
                      ((x10.array.Array)(threadArr));
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$30022 =
                      i30027;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
org.xgdbench.generator.MAGThread ret30023 =
                       null;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array x$30013 =
                      p$30021;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i30014 =
                      p$30022;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30015 =
                      ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$30013).
                        rank;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30016 =
                      ((int) t30015) ==
                    ((int) 1);
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30017 =
                      !(t30016);
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t30017) {
                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30018 =
                          true;
                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t30018) {
                            
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.FailedDynamicCheckException t30019 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
throw t30019;
                        }
                    }
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t30020 =
                      ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$30013).$apply$G((int)(x$i30014));
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
ret30023 = t30020;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t30024 =
                      ret30023;
                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t30024.join();
                }}catch (java.lang.InterruptedException e30025) {
                    
//#line 68 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final java.lang.InterruptedException t30026 =
                      e30025;
                    
//#line 68 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t30026.printStackTrace();
                }
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30028 =
                  i30030;
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30029 =
                  ((t30028) + (((int)(1))));
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
i30030 = t30029;
            }
            
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29767min30064 =
              0;
            
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30065 =
              threadCount;
            
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i29767max30066 =
              ((t30065) - (((int)(1))));
            
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
int i30052 =
              i29767min30064;
            
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
for (;
                                                                                                            true;
                                                                                                            ) {
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30053 =
                  i30052;
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30054 =
                  ((t30053) <= (((int)(i29767max30066))));
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (!(t30054)) {
                    
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
break;
                }
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int i30049 =
                  i30052;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAG x30041 =
                  ((org.xgdbench.generator.MAG)(this));
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array p$30042 =
                  ((x10.array.Array)(threadArr));
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int p$30043 =
                  i30049;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
org.xgdbench.generator.MAGThread ret30044 =
                   null;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array x$30033 =
                  p$30042;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int x$i30034 =
                  p$30043;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30035 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$30033).
                    rank;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30036 =
                  ((int) t30035) ==
                ((int) 1);
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30037 =
                  !(t30036);
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t30037) {
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final boolean t30038 =
                      true;
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
if (t30038) {
                        
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.lang.FailedDynamicCheckException t30039 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
throw t30039;
                    }
                }
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t30040 =
                  ((x10.array.Array<org.xgdbench.generator.MAGThread>)x$30033).$apply$G((int)(x$i30034));
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
ret30044 = t30040;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGThread t30045 =
                  ret30044;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int y30046 =
                  t30045.getNEdges$O();
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30047 =
                  x30041.
                    nEdges;
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30048 =
                  ((t30047) + (((int)(y30046))));
                
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
x30041.nEdges = t30048;
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30050 =
                  i30052;
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t30051 =
                  ((t30050) + (((int)(1))));
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
i30052 = t30051;
            }
            
//#line 112 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGResult t29925 =
              result1;
            
//#line 112 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29926 =
              nodesAttribs;
            
//#line 112 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t29925.nodesAttribs = ((x10.array.Array)(t29926));
            
//#line 113 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGResult t29927 =
              result1;
            
//#line 113 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final x10.array.Array t29928 =
              ((x10.array.Array)(threadArr));
            
//#line 113 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
t29927.edges = ((x10.array.Array)(t29928));
            
//#line 115 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final org.xgdbench.generator.MAGResult t29929 =
              result1;
            
//#line 115 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
return t29929;
        }
        
        
//#line 118 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
public long
                                                                                                      getEntityCount$O(
                                                                                                      ){
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29930 =
              nVertices;
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29931 =
              nEdges;
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final int t29932 =
              ((t29930) + (((int)(t29931))));
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final long t29933 =
              ((long)(((int)(t29932))));
            
//#line 119 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
return t29933;
        }
        
        
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final public org.xgdbench.generator.MAG
                                                                                                    org$xgdbench$generator$MAG$$this$org$xgdbench$generator$MAG(
                                                                                                    ){
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
return org.xgdbench.generator.MAG.this;
        }
        
        
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final public void
                                                                                                    __fieldInitializers29610(
                                                                                                    ){
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.nVertices = 0;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.nEdges = 0;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.nAttributes = 0;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.attribThreshold = 0;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.pThreshold = 0.0F;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.theta = null;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.result = 0.0F;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.threadCount = 0;
            
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
this.threadArr = null;
        }
        
        @x10.runtime.impl.java.X10Generated final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$2> $RTT = x10.rtt.StaticFunType.<$Closure$2> make(
            /* base class */$Closure$2.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.BYTE)}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAG.$Closure$2 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$2.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $Closure$2 $_obj = new $Closure$2((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$2(final java.lang.System[] $dummy) { 
            }
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Byte.$box($apply$O((x10.array.Point)a1));
            }
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public byte $apply$B(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O((x10.array.Point)a1);
            }
            
                
                public byte
                  $apply$O(
                  final x10.array.Point p){
                    
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
final byte t29832 =
                      ((byte)(int)(((int)(1))));
                    
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAG.x10"
return t29832;
                }
                
                public $Closure$2() { {
                                             
                                         }}
                
            }
            
        // synthetic type for parameter mangling
        public static final class __4$1x10$lang$Float$2 {}
        
    }
    
    