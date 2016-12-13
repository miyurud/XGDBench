package org.xgdbench.generator;


@x10.runtime.impl.java.X10Generated public class MAGThread extends java.lang.Thread implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAGThread> $RTT = x10.rtt.NamedType.<MAGThread> make(
    "org.xgdbench.generator.MAGThread", /* base class */MAGThread.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.getRTT(java.lang.Thread.class)}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAGThread $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAGThread.class + " calling"); } 
        $deserializer.deserializeClassUsingReflection(java.lang.Thread.class, $_obj, 0);
        $_obj.nVertices = $deserializer.readInt();
        $_obj.nAttributes = $deserializer.readInt();
        $_obj.nodesAttribs = $deserializer.readRef();
        $_obj.result = $deserializer.readFloat();
        $_obj.theta = $deserializer.readRef();
        $_obj.pThreshold = $deserializer.readFloat();
        $_obj.stkEdges = $deserializer.readRef();
        $_obj.nEdges = $deserializer.readInt();
        $_obj.startI = $deserializer.readInt();
        $_obj.endI = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAGThread $_obj = new MAGThread((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.serializeClassUsingReflection(this, java.lang.Thread.class);
        $serializer.write(this.nVertices);
        $serializer.write(this.nAttributes);
        if (nodesAttribs instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.nodesAttribs);
        } else {
        $serializer.write(this.nodesAttribs);
        }
        $serializer.write(this.result);
        if (theta instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.theta);
        } else {
        $serializer.write(this.theta);
        }
        $serializer.write(this.pThreshold);
        if (stkEdges instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.stkEdges);
        } else {
        $serializer.write(this.stkEdges);
        }
        $serializer.write(this.nEdges);
        $serializer.write(this.startI);
        $serializer.write(this.endI);
        
    }
    
    // constructor just for allocation
    public MAGThread(final java.lang.System[] $dummy) { 
    }
    
        
//#line 6 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int nVertices;
        
//#line 7 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int nAttributes;
        
//#line 8 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public x10.array.Array<x10.core.Byte> nodesAttribs;
        
//#line 9 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public float result;
        
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public x10.array.Array<x10.core.Float> theta;
        
//#line 11 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public float pThreshold;
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public x10.util.Stack<x10.array.Array<x10.core.Int>> stkEdges;
        
//#line 13 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int nEdges;
        
//#line 14 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int startI;
        
//#line 15 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int endI;
        
        
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public MAGThread(int nVertices,
                                                                                                                          int nAttributes,
                                                                                                                          x10.array.Array<x10.core.Byte> nodesAttribs,
                                                                                                                          x10.array.Array<x10.core.Float> theta,
                                                                                                                          float pThreshold,
                                                                                                                          int startI,
                                                                                                                          int endI, __2$1x10$lang$Byte$2__3$1x10$lang$Float$2 $dummy) {super();
                                                                                                                                                                                            {
                                                                                                                                                                                               
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"

                                                                                                                                                                                               
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.__fieldInitializers29067();
                                                                                                                                                                                               
//#line 18 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nVertices = nVertices;
                                                                                                                                                                                               
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nAttributes = nAttributes;
                                                                                                                                                                                               
//#line 20 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nodesAttribs = ((x10.array.Array)(nodesAttribs));
                                                                                                                                                                                               
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.theta = ((x10.array.Array)(theta));
                                                                                                                                                                                               
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.pThreshold = pThreshold;
                                                                                                                                                                                               
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.startI = startI;
                                                                                                                                                                                               
//#line 24 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.endI = endI;
                                                                                                                                                                                               
//#line 25 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.stkEdges = ((x10.util.Stack)(new x10.util.Stack<x10.array.Array<x10.core.Int>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.array.Array.$RTT, x10.rtt.Types.INT)).x10$util$Stack$$init$S()));
                                                                                                                                                                                           }}
        
        
//#line 35 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public int
                                                                                                           getNEdges$O(
                                                                                                           ){
            
//#line 36 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29293 =
              nEdges;
            
//#line 36 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
return t29293;
        }
        
        
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public boolean
                                                                                                           hasNextEdge$O(
                                                                                                           ){
            
//#line 40 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.util.Stack t29294 =
              ((x10.util.Stack)(stkEdges));
            
//#line 40 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29295 =
              ((x10.util.ArrayList<x10.array.Array<x10.core.Int>>)t29294).size$O();
            
//#line 40 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29296 =
              ((t29295) > (((int)(0))));
            
//#line 40 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29296) {
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
return true;
            } else {
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
return false;
            }
        }
        
        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public x10.array.Array
                                                                                                           nextEdge(
                                                                                                           ){
            
//#line 48 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.util.Stack t29297 =
              ((x10.util.Stack)(stkEdges));
            
//#line 48 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array t29298 =
              ((x10.util.Stack<x10.array.Array<x10.core.Int>>)t29297).pop$G();
            
//#line 48 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
return t29298;
        }
        
        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
public void
                                                                                                           run(
                                                                                                           ){
            
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29196min29197 =
              startI;
            
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29299 =
              endI;
            
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29196max29198 =
              ((t29299) - (((int)(1))));
            
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
int i29607 =
              i29196min29197;
            
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
for (;
                                                                                                                  true;
                                                                                                                  ) {
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29608 =
                  i29607;
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29609 =
                  ((t29608) <= (((int)(i29196max29198))));
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (!(t29609)) {
                    
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
break;
                }
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29604 =
                  i29607;
                
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29180min29601 =
                  0;
                
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29602 =
                  nVertices;
                
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29180max29603 =
                  ((t29602) - (((int)(1))));
                
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
int i29598 =
                  i29180min29601;
                
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29599 =
                      i29598;
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29600 =
                      ((t29599) <= (((int)(i29180max29603))));
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (!(t29600)) {
                        
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
break;
                    }
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int j29595 =
                      i29598;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = 1.0F;
                    
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29164min29583 =
                      0;
                    
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29584 =
                      nAttributes;
                    
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int i29164max29585 =
                      ((t29584) - (((int)(1))));
                    
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
int i29580 =
                      i29164min29583;
                    
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29581 =
                          i29580;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29582 =
                          ((t29581) <= (((int)(i29164max29585))));
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (!(t29582)) {
                            
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
break;
                        }
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int k29577 =
                          i29580;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29511 =
                          ((x10.array.Array)(nodesAttribs));
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29512 =
                          i29604;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29513 =
                          k29577;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29514 =
                           0;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29493 =
                          p$29511;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29494 =
                          p$29512;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29495 =
                          p$29513;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29496 =
                          ((x10.array.Array<x10.core.Byte>)x$29493).
                            rank;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29497 =
                          ((int) t29496) ==
                        ((int) 2);
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29498 =
                          !(t29497);
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29498) {
                            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29499 =
                              true;
                            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29499) {
                                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29500 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29500;
                            }
                        }
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29501 =
                          x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29493).$apply$G((int)(x$i29494),
                                                                                                  (int)(x$i29495)));
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29514 = t29501;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29515 =
                          ret29514;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29516 =
                          ((x10.array.Array)(nodesAttribs));
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29517 =
                          j29595;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29518 =
                          k29577;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29519 =
                           0;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29502 =
                          p$29516;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29503 =
                          p$29517;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29504 =
                          p$29518;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29505 =
                          ((x10.array.Array<x10.core.Byte>)x$29502).
                            rank;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29506 =
                          ((int) t29505) ==
                        ((int) 2);
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29507 =
                          !(t29506);
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29507) {
                            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29508 =
                              true;
                            
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29508) {
                                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29509 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29509;
                            }
                        }
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29510 =
                          x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29502).$apply$G((int)(x$i29503),
                                                                                                  (int)(x$i29504)));
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29519 = t29510;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29520 =
                          ret29519;
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29521 =
                          ((byte) t29515) ==
                        ((byte) t29520);
                        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29521) {
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29522 =
                              ((x10.array.Array)(nodesAttribs));
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29523 =
                              i29604;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29524 =
                              k29577;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29525 =
                               0;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29434 =
                              p$29522;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29435 =
                              p$29523;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29436 =
                              p$29524;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29437 =
                              ((x10.array.Array<x10.core.Byte>)x$29434).
                                rank;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29438 =
                              ((int) t29437) ==
                            ((int) 2);
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29439 =
                              !(t29438);
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29439) {
                                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29440 =
                                  true;
                                
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29440) {
                                    
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29441 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                    
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29441;
                                }
                            }
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29442 =
                              x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29434).$apply$G((int)(x$i29435),
                                                                                                      (int)(x$i29436)));
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29525 = t29442;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29526 =
                              ret29525;
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29527 =
                              ((int)(byte)(((byte)(t29526))));
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29528 =
                              ((int) t29527) ==
                            ((int) 0);
                            
//#line 57 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29528) {
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29529 =
                                  result;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29530 =
                                  ((x10.array.Array)(theta));
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
float ret29531 =
                                   0;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29420 =
                                  p$29530;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29421 =
                                  ((x10.array.Array<x10.core.Float>)x$29420).
                                    rank;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29422 =
                                  ((int) t29421) ==
                                ((int) 1);
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29423 =
                                  !(t29422);
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29423) {
                                    
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29424 =
                                      true;
                                    
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29424) {
                                        
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29425 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29425;
                                    }
                                }
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29426 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$29420).$apply$G((int)(0)));
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29531 = t29426;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29532 =
                                  ret29531;
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29533 =
                                  ((t29529) * (((float)(t29532))));
                                
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = t29533;
                            } else {
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29534 =
                                  result;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29535 =
                                  ((x10.array.Array)(theta));
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
float ret29536 =
                                   0;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29427 =
                                  p$29535;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29428 =
                                  ((x10.array.Array<x10.core.Float>)x$29427).
                                    rank;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29429 =
                                  ((int) t29428) ==
                                ((int) 1);
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29430 =
                                  !(t29429);
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29430) {
                                    
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29431 =
                                      true;
                                    
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29431) {
                                        
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29432 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29432;
                                    }
                                }
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29433 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$29427).$apply$G((int)(3)));
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29536 = t29433;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29537 =
                                  ret29536;
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29538 =
                                  ((t29534) * (((float)(t29537))));
                                
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = t29538;
                            }
                        } else {
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29539 =
                              ((x10.array.Array)(nodesAttribs));
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29540 =
                              i29604;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29541 =
                              k29577;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29542 =
                               0;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29484 =
                              p$29539;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29485 =
                              p$29540;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29486 =
                              p$29541;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29487 =
                              ((x10.array.Array<x10.core.Byte>)x$29484).
                                rank;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29488 =
                              ((int) t29487) ==
                            ((int) 2);
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29489 =
                              !(t29488);
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29489) {
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29490 =
                                  true;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29490) {
                                    
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29491 =
                                      ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                    
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29491;
                                }
                            }
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29492 =
                              x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29484).$apply$G((int)(x$i29485),
                                                                                                      (int)(x$i29486)));
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29542 = t29492;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29543 =
                              ret29542;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29544 =
                              ((int)(byte)(((byte)(t29543))));
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
boolean t29545 =
                              ((int) t29544) ==
                            ((int) 0);
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29545) {
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29546 =
                                  ((x10.array.Array)(nodesAttribs));
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29547 =
                                  j29595;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29548 =
                                  k29577;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29549 =
                                   0;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29443 =
                                  p$29546;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29444 =
                                  p$29547;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29445 =
                                  p$29548;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29446 =
                                  ((x10.array.Array<x10.core.Byte>)x$29443).
                                    rank;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29447 =
                                  ((int) t29446) ==
                                ((int) 2);
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29448 =
                                  !(t29447);
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29448) {
                                    
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29449 =
                                      true;
                                    
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29449) {
                                        
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29450 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                        
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29450;
                                    }
                                }
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29451 =
                                  x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29443).$apply$G((int)(x$i29444),
                                                                                                          (int)(x$i29445)));
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29549 = t29451;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29550 =
                                  ret29549;
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29551 =
                                  ((int)(byte)(((byte)(t29550))));
                                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
t29545 = ((int) t29551) ==
                                ((int) 1);
                            }
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29552 =
                              t29545;
                            
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29552) {
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29553 =
                                  result;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29554 =
                                  ((x10.array.Array)(theta));
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
float ret29555 =
                                   0;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29452 =
                                  p$29554;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29453 =
                                  ((x10.array.Array<x10.core.Float>)x$29452).
                                    rank;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29454 =
                                  ((int) t29453) ==
                                ((int) 1);
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29455 =
                                  !(t29454);
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29455) {
                                    
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29456 =
                                      true;
                                    
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29456) {
                                        
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29457 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                        
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29457;
                                    }
                                }
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29458 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$29452).$apply$G((int)(1)));
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29555 = t29458;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29556 =
                                  ret29555;
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29557 =
                                  ((t29553) * (((float)(t29556))));
                                
//#line 64 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = t29557;
                            } else {
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29558 =
                                  ((x10.array.Array)(nodesAttribs));
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29559 =
                                  i29604;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29560 =
                                  k29577;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29561 =
                                   0;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29475 =
                                  p$29558;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29476 =
                                  p$29559;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29477 =
                                  p$29560;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29478 =
                                  ((x10.array.Array<x10.core.Byte>)x$29475).
                                    rank;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29479 =
                                  ((int) t29478) ==
                                ((int) 2);
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29480 =
                                  !(t29479);
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29480) {
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29481 =
                                      true;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29481) {
                                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29482 =
                                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29482;
                                    }
                                }
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29483 =
                                  x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29475).$apply$G((int)(x$i29476),
                                                                                                          (int)(x$i29477)));
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29561 = t29483;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29562 =
                                  ret29561;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29563 =
                                  ((int)(byte)(((byte)(t29562))));
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
boolean t29564 =
                                  ((int) t29563) ==
                                ((int) 1);
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29564) {
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29565 =
                                      ((x10.array.Array)(nodesAttribs));
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29566 =
                                      j29595;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int p$29567 =
                                      k29577;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
byte ret29568 =
                                       0;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29459 =
                                      p$29565;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29460 =
                                      p$29566;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int x$i29461 =
                                      p$29567;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29462 =
                                      ((x10.array.Array<x10.core.Byte>)x$29459).
                                        rank;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29463 =
                                      ((int) t29462) ==
                                    ((int) 2);
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29464 =
                                      !(t29463);
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29464) {
                                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29465 =
                                          true;
                                        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29465) {
                                            
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29466 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 2)")))));
                                            
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29466;
                                        }
                                    }
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29467 =
                                      x10.core.Byte.$unbox(((x10.array.Array<x10.core.Byte>)x$29459).$apply$G((int)(x$i29460),
                                                                                                              (int)(x$i29461)));
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29568 = t29467;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final byte t29569 =
                                      ret29568;
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29570 =
                                      ((int)(byte)(((byte)(t29569))));
                                    
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
t29564 = ((int) t29570) ==
                                    ((int) 0);
                                }
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29571 =
                                  t29564;
                                
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29571) {
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29572 =
                                      result;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array p$29573 =
                                      ((x10.array.Array)(theta));
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
float ret29574 =
                                       0;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array x$29468 =
                                      p$29573;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29469 =
                                      ((x10.array.Array<x10.core.Float>)x$29468).
                                        rank;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29470 =
                                      ((int) t29469) ==
                                    ((int) 1);
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29471 =
                                      !(t29470);
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29471) {
                                        
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29472 =
                                          true;
                                        
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29472) {
                                            
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.lang.FailedDynamicCheckException t29473 =
                                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                            
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
throw t29473;
                                        }
                                    }
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29474 =
                                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$29468).$apply$G((int)(2)));
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
ret29574 = t29474;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29575 =
                                      ret29574;
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29576 =
                                      ((t29572) * (((float)(t29575))));
                                    
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = t29576;
                                }
                            }
                        }
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29578 =
                          i29580;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29579 =
                          ((t29578) + (((int)(1))));
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
i29580 = t29579;
                    }
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29586 =
                      result;
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final float t29587 =
                      pThreshold;
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final boolean t29588 =
                      ((t29586) > (((float)(t29587))));
                    
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
if (t29588) {
                        
//#line 79 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
x10.array.Array arr29589 =
                          ((x10.array.Array)(x10.runtime.impl.java.ArrayUtils.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {i29604, j29595})));
                        
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.util.Stack t29590 =
                          ((x10.util.Stack)(stkEdges));
                        
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final x10.array.Array t29591 =
                          ((x10.array.Array)(arr29589));
                        
//#line 80 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
((x10.util.Stack<x10.array.Array<x10.core.Int>>)t29590).push__0x10$util$Stack$$T$O(((x10.array.Array)(t29591)));
                        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final org.xgdbench.generator.MAGThread x29592 =
                          ((org.xgdbench.generator.MAGThread)(this));
                        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
;
                        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29593 =
                          x29592.
                            nEdges;
                        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29594 =
                          ((t29593) + (((int)(1))));
                        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
x29592.nEdges = t29594;
                    }
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29596 =
                      i29598;
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29597 =
                      ((t29596) + (((int)(1))));
                    
//#line 53 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
i29598 = t29597;
                }
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29605 =
                  i29607;
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final int t29606 =
                  ((t29605) + (((int)(1))));
                
//#line 52 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
i29607 = t29606;
            }
        }
        
        
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final public org.xgdbench.generator.MAGThread
                                                                                                          org$xgdbench$generator$MAGThread$$this$org$xgdbench$generator$MAGThread(
                                                                                                          ){
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
return org.xgdbench.generator.MAGThread.this;
        }
        
        
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
final public void
                                                                                                          __fieldInitializers29067(
                                                                                                          ){
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nVertices = 0;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nAttributes = 0;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nodesAttribs = null;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.result = 0.0F;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.theta = null;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.pThreshold = 0.0F;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.stkEdges = null;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.nEdges = 0;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.startI = 0;
            
//#line 5 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGThread.x10"
this.endI = 0;
        }
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Byte$2__3$1x10$lang$Float$2 {}
        
    }
    
    