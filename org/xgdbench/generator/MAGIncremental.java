package org.xgdbench.generator;


@x10.runtime.impl.java.X10Generated public class MAGIncremental extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAGIncremental> $RTT = x10.rtt.NamedType.<MAGIncremental> make(
    "org.xgdbench.generator.MAGIncremental", /* base class */MAGIncremental.class
    
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAGIncremental $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAGIncremental.class + " calling"); } 
        $_obj.pThreshold = $deserializer.readFloat();
        $_obj.affinityMatrix = $deserializer.readRef();
        $_obj.vertexAttribs = $deserializer.readRef();
        $_obj.attribCount = $deserializer.readInt();
        $_obj.attribThreshold = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAGIncremental $_obj = new MAGIncremental((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.pThreshold);
        if (affinityMatrix instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.affinityMatrix);
        } else {
        $serializer.write(this.affinityMatrix);
        }
        if (vertexAttribs instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.vertexAttribs);
        } else {
        $serializer.write(this.vertexAttribs);
        }
        $serializer.write(this.attribCount);
        $serializer.write(this.attribThreshold);
        
    }
    
    // constructor just for allocation
    public MAGIncremental(final java.lang.System[] $dummy) { 
    }
    
        
//#line 13 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public float pThreshold;
        
//#line 14 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public x10.array.Array<x10.core.Float> affinityMatrix;
        
//#line 15 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>> vertexAttribs;
        
//#line 16 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public int attribCount;
        
//#line 17 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public int attribThreshold;
        
        
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
// creation method for java code (1-phase java constructor)
        public MAGIncremental(x10.array.Array<x10.core.Float> aff,
                              x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>> vertexAttribs,
                              float pThreshold,
                              int attribCount, __0$1x10$lang$Float$2__1$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2 $dummy){this((java.lang.System[]) null);
                                                                                                                                     org$xgdbench$generator$MAGIncremental$$init$S(aff,vertexAttribs,pThreshold,attribCount, (org.xgdbench.generator.MAGIncremental.__0$1x10$lang$Float$2__1$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2) null);}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.MAGIncremental org$xgdbench$generator$MAGIncremental$$init$S(x10.array.Array<x10.core.Float> aff,
                                                                                                         x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>> vertexAttribs,
                                                                                                         float pThreshold,
                                                                                                         int attribCount, __0$1x10$lang$Float$2__1$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2 $dummy) { {
                                                                                                                                                                                                                     
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
;
                                                                                                                                                                                                                     
//#line 19 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"

                                                                                                                                                                                                                     
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.__fieldInitializers24666();
                                                                                                                                                                                                                     
//#line 20 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t24861 =
                                                                                                                                                                                                                       aff;
                                                                                                                                                                                                                     
//#line 20 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.affinityMatrix = ((x10.array.Array)(t24861));
                                                                                                                                                                                                                     
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.HashMap t24862 =
                                                                                                                                                                                                                       vertexAttribs;
                                                                                                                                                                                                                     
//#line 21 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.vertexAttribs = ((x10.util.HashMap)(t24862));
                                                                                                                                                                                                                     
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t24863 =
                                                                                                                                                                                                                       pThreshold;
                                                                                                                                                                                                                     
//#line 22 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.pThreshold = t24863;
                                                                                                                                                                                                                     
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t24864 =
                                                                                                                                                                                                                       attribCount;
                                                                                                                                                                                                                     
//#line 23 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.attribCount = t24864;
                                                                                                                                                                                                                 }
                                                                                                                                                                                                                 return this;
                                                                                                                                                                                                                 }
        
        
        
//#line 26 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public void
                                                                                                                setVerticesAndAttributes__0$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2(
                                                                                                                x10.util.HashMap vertexAttribs){
            
//#line 27 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.HashMap t24865 =
              vertexAttribs;
            
//#line 27 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.vertexAttribs = ((x10.util.HashMap)(t24865));
        }
        
        
//#line 30 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public org.xgdbench.generator.Vertex
                                                                                                                getListOfVerticesToConnectWith(
                                                                                                                long vertID){
            
//#line 31 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
org.xgdbench.generator.Vertex out =
              new org.xgdbench.generator.Vertex((java.lang.System[]) null).org$xgdbench$generator$Vertex$$init$S();
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.array.Array values =
              this.getRandomUserOptions();
            
//#line 34 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.util.ArrayList result =
              new x10.util.ArrayList<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$util$ArrayList$$init$S();
            
//#line 35 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.HashMap t24866 =
              ((x10.util.HashMap)(vertexAttribs));
            
//#line 35 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.util.Set items =
              ((x10.util.Set<x10.core.Int>)
                ((x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>>)t24866).keySet());
            
//#line 36 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.Set t24867 =
              items;
            
//#line 36 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.lang.Iterator itr =
              ((x10.lang.Iterator<x10.core.Int>)
                ((x10.lang.Iterable<x10.core.Int>)t24867).iterator());
            
//#line 37 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int key =
              -1;
            
//#line 38 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
float p =
              ((float)(int)(((int)(1))));
            
//#line 39 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.array.Array params =
              null;
            
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
while (true) {
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.Iterator t24868 =
                  itr;
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t24977 =
                  ((x10.lang.Iterator<x10.core.Int>)t24868).hasNext$O();
                
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (!(t24977)) {
                    
//#line 41 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
break;
                }
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.Iterator t25166 =
                  itr;
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25167 =
                  x10.core.Int.$unbox(((x10.lang.Iterator<x10.core.Int>)t25166).next$G());
                
//#line 42 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
key = t25167;
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.HashMap t25168 =
                  ((x10.util.HashMap)(vertexAttribs));
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25169 =
                  key;
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.Box t25170 =
                  ((x10.util.Box<x10.array.Array<x10.core.Int>>)
                    ((x10.util.HashMap<x10.core.Int, x10.array.Array<x10.core.Int>>)t25168).get__0x10$util$HashMap$$K(x10.core.Int.$box(t25169)));
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t25171 =
                  ((x10.array.Array)(((x10.util.Box<x10.array.Array<x10.core.Int>>)t25170).
                                       value));
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t25172 =
                  ((x10.array.Array<x10.core.Int>)
                    t25171);
                
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
params = t25172;
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i24748min25162 =
                  0;
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t25163 =
                  params;
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25164 =
                  ((x10.array.Array<x10.core.Int>)t25163).
                    size;
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i24748max25165 =
                  ((t25164) - (((int)(1))));
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int i25159 =
                  i24748min25162;
                
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25160 =
                      i25159;
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25161 =
                      ((t25160) <= (((int)(i24748max25165))));
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (!(t25161)) {
                        
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
break;
                    }
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i25156 =
                      i25159;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25104 =
                      ((x10.array.Array)(params));
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25105 =
                      i25156;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25106 =
                       0;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25056 =
                      p$25104;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25057 =
                      p$25105;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25058 =
                      ((x10.array.Array<x10.core.Int>)x$25056).
                        rank;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25059 =
                      ((int) t25058) ==
                    ((int) 1);
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25060 =
                      !(t25059);
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25060) {
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25061 =
                          true;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25061) {
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25062 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25062;
                        }
                    }
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25063 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25056).$apply$G((int)(x$i25057)));
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25106 = t25063;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25107 =
                      ret25106;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25108 =
                      ((x10.array.Array)(values));
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25109 =
                      i25156;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25110 =
                       0;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25064 =
                      p$25108;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25065 =
                      p$25109;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25066 =
                      ((x10.array.Array<x10.core.Int>)x$25064).
                        rank;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25067 =
                      ((int) t25066) ==
                    ((int) 1);
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25068 =
                      !(t25067);
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25068) {
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25069 =
                          true;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25069) {
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25070 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25070;
                        }
                    }
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25071 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25064).$apply$G((int)(x$i25065)));
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25110 = t25071;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25111 =
                      ret25110;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
boolean t25112 =
                      ((int) t25107) ==
                    ((int) t25111);
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25112) {
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25113 =
                          ((x10.array.Array)(params));
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25114 =
                          i25156;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25115 =
                           0;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25019 =
                          p$25113;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25020 =
                          p$25114;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25021 =
                          ((x10.array.Array<x10.core.Int>)x$25019).
                            rank;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25022 =
                          ((int) t25021) ==
                        ((int) 1);
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25023 =
                          !(t25022);
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25023) {
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25024 =
                              true;
                            
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25024) {
                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25025 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25025;
                            }
                        }
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25026 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25019).$apply$G((int)(x$i25020)));
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25115 = t25026;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25116 =
                          ret25115;
                        
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t25112 = ((int) t25116) ==
                        ((int) 0);
                    }
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25117 =
                      t25112;
                    
//#line 46 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25117) {
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25118 =
                          p;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25119 =
                          ((x10.array.Array)(affinityMatrix));
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
float ret25120 =
                           0;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25027 =
                          p$25119;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25028 =
                          ((x10.array.Array<x10.core.Float>)x$25027).
                            rank;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25029 =
                          ((int) t25028) ==
                        ((int) 1);
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25030 =
                          !(t25029);
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25030) {
                            
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25031 =
                              true;
                            
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25031) {
                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25032 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25032;
                            }
                        }
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25033 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$25027).$apply$G((int)(0)));
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25120 = t25033;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25121 =
                          ret25120;
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25122 =
                          ((t25118) * (((float)(t25121))));
                        
//#line 47 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
p = t25122;
                    }
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25123 =
                      ((x10.array.Array)(params));
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25124 =
                      i25156;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25125 =
                       0;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25072 =
                      p$25123;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25073 =
                      p$25124;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25074 =
                      ((x10.array.Array<x10.core.Int>)x$25072).
                        rank;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25075 =
                      ((int) t25074) ==
                    ((int) 1);
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25076 =
                      !(t25075);
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25076) {
                        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25077 =
                          true;
                        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25077) {
                            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25078 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25078;
                        }
                    }
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25079 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25072).$apply$G((int)(x$i25073)));
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25125 = t25079;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25126 =
                      ret25125;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25127 =
                      ((x10.array.Array)(values));
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25128 =
                      i25156;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25129 =
                       0;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25080 =
                      p$25127;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25081 =
                      p$25128;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25082 =
                      ((x10.array.Array<x10.core.Int>)x$25080).
                        rank;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25083 =
                      ((int) t25082) ==
                    ((int) 1);
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25084 =
                      !(t25083);
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25084) {
                        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25085 =
                          true;
                        
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25085) {
                            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25086 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25086;
                        }
                    }
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25087 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25080).$apply$G((int)(x$i25081)));
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25129 = t25087;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25130 =
                      ret25129;
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25131 =
                      ((int) t25126) !=
                    ((int) t25130);
                    
//#line 50 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25131) {
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25132 =
                          p;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25133 =
                          ((x10.array.Array)(affinityMatrix));
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
float ret25134 =
                           0;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25034 =
                          p$25133;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25035 =
                          ((x10.array.Array<x10.core.Float>)x$25034).
                            rank;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25036 =
                          ((int) t25035) ==
                        ((int) 1);
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25037 =
                          !(t25036);
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25037) {
                            
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25038 =
                              true;
                            
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25038) {
                                
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25039 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25039;
                            }
                        }
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25040 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$25034).$apply$G((int)(1)));
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25134 = t25040;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25135 =
                          ret25134;
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25136 =
                          ((t25132) * (((float)(t25135))));
                        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
p = t25136;
                    }
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25137 =
                      ((x10.array.Array)(params));
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25138 =
                      i25156;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25139 =
                       0;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25088 =
                      p$25137;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25089 =
                      p$25138;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25090 =
                      ((x10.array.Array<x10.core.Int>)x$25088).
                        rank;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25091 =
                      ((int) t25090) ==
                    ((int) 1);
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25092 =
                      !(t25091);
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25092) {
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25093 =
                          true;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25093) {
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25094 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25094;
                        }
                    }
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25095 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25088).$apply$G((int)(x$i25089)));
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25139 = t25095;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25140 =
                      ret25139;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25141 =
                      ((x10.array.Array)(values));
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25142 =
                      i25156;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25143 =
                       0;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25096 =
                      p$25141;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25097 =
                      p$25142;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25098 =
                      ((x10.array.Array<x10.core.Int>)x$25096).
                        rank;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25099 =
                      ((int) t25098) ==
                    ((int) 1);
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25100 =
                      !(t25099);
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25100) {
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25101 =
                          true;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25101) {
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25102 =
                              ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25102;
                        }
                    }
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25103 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25096).$apply$G((int)(x$i25097)));
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25143 = t25103;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25144 =
                      ret25143;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
boolean t25145 =
                      ((int) t25140) ==
                    ((int) t25144);
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25145) {
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25146 =
                          ((x10.array.Array)(params));
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25147 =
                          i25156;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25148 =
                           0;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25041 =
                          p$25146;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25042 =
                          p$25147;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25043 =
                          ((x10.array.Array<x10.core.Int>)x$25041).
                            rank;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25044 =
                          ((int) t25043) ==
                        ((int) 1);
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25045 =
                          !(t25044);
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25045) {
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25046 =
                              true;
                            
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25046) {
                                
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25047 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25047;
                            }
                        }
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25048 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25041).$apply$G((int)(x$i25042)));
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25148 = t25048;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25149 =
                          ret25148;
                        
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t25145 = ((int) t25149) ==
                        ((int) 1);
                    }
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25150 =
                      t25145;
                    
//#line 54 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25150) {
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25151 =
                          p;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25152 =
                          ((x10.array.Array)(affinityMatrix));
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
float ret25153 =
                           0;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25049 =
                          p$25152;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25050 =
                          ((x10.array.Array<x10.core.Float>)x$25049).
                            rank;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25051 =
                          ((int) t25050) ==
                        ((int) 1);
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25052 =
                          !(t25051);
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25052) {
                            
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25053 =
                              true;
                            
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25053) {
                                
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25054 =
                                  ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                                
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25054;
                            }
                        }
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25055 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$25049).$apply$G((int)(3)));
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25153 = t25055;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25154 =
                          ret25153;
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25155 =
                          ((t25151) * (((float)(t25154))));
                        
//#line 55 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
p = t25155;
                    }
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25157 =
                      i25159;
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25158 =
                      ((t25157) + (((int)(1))));
                    
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
i25159 = t25158;
                }
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25173 =
                  p;
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25174 =
                  pThreshold;
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25175 =
                  ((t25173) > (((float)(t25174))));
                
//#line 59 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25175) {
                    
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.ArrayList t25176 =
                      result;
                    
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25177 =
                      key;
                    
//#line 60 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
((x10.util.ArrayList<x10.core.Int>)t25176).add__0x10$util$ArrayList$$T$O(x10.core.Int.$box(t25177));
                }
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final float t25178 =
                  ((float)(int)(((int)(1))));
                
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
p = t25178;
            }
            
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.ArrayList t24978 =
              result;
            
//#line 66 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.lang.Iterator itr2 =
              ((x10.lang.Iterator)(((x10.util.ListIterator<x10.core.Int>)
                                     ((x10.util.ArrayList<x10.core.Int>)t24978).iterator())));
            
//#line 67 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.util.ArrayList t24979 =
              result;
            
//#line 67 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t24980 =
              ((x10.util.ArrayList<x10.core.Int>)t24979).size$O();
            
//#line 67 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.array.Array endRes =
              new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array$$init$S(t24980);
            
//#line 68 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int counter =
              0;
            
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
while (true) {
                
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.Iterator t24981 =
                  itr2;
                
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t24991 =
                  ((x10.lang.Iterator<x10.core.Int>)t24981).hasNext$O();
                
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (!(t24991)) {
                    
//#line 70 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
break;
                }
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25188 =
                  ((x10.array.Array)(endRes));
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25189 =
                  counter;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.Iterator t25190 =
                  itr2;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25191 =
                  x10.core.Int.$unbox(((x10.lang.Iterator<x10.core.Int>)t25190).next$G());
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25192 =
                   0;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25179 =
                  p$25188;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25180 =
                  p$25189;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$v25181 =
                  p$25191;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25182 =
                  ((x10.array.Array<x10.core.Int>)x$25179).
                    rank;
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25183 =
                  ((int) t25182) ==
                ((int) 1);
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25184 =
                  !(t25183);
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25184) {
                    
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25185 =
                      true;
                    
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25185) {
                        
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25186 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25186;
                    }
                }
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25187 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25179).$set__1x10$array$Array$$T$G((int)(x$i25180),
                                                                                                           x10.core.Int.$box(x$v25181)));
                
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25192 = t25187;
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25193 =
                  counter;
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25194 =
                  ((t25193) + (((int)(1))));
                
//#line 72 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
counter = t25194;
            }
            
//#line 75 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final org.xgdbench.generator.Vertex t24992 =
              out;
            
//#line 75 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t24993 =
              values;
            
//#line 75 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t24992.attribs = ((x10.array.Array)(t24993));
            
//#line 76 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final org.xgdbench.generator.Vertex t24994 =
              out;
            
//#line 76 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t24995 =
              endRes;
            
//#line 76 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t24994.neighbours = ((x10.array.Array)(t24995));
            
//#line 77 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final org.xgdbench.generator.Vertex t24996 =
              out;
            
//#line 77 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final long t24997 =
              vertID;
            
//#line 77 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t24996.pername = t24997;
            
//#line 79 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final org.xgdbench.generator.Vertex t24998 =
              out;
            
//#line 79 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
return t24998;
        }
        
        
//#line 82 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
public x10.array.Array
                                                                                                                getRandomUserOptions(
                                                                                                                ){
            
//#line 83 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t24999 =
              attribCount;
            
//#line 83 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
x10.array.Array result =
              new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array$$init$S(t24999);
            
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final long t25000 =
              x10.lang.System.currentTimeMillis$O();
            
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
java.util.Random rnd =
              new java.util.Random(t25000);
            
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i24764min25219 =
              0;
            
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25220 =
              attribCount;
            
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i24764max25221 =
              ((t25220) - (((int)(1))));
            
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int i25216 =
              i24764min25219;
            
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
for (;
                                                                                                                       true;
                                                                                                                       ) {
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25217 =
                  i25216;
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25218 =
                  ((t25217) <= (((int)(i24764max25221))));
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (!(t25218)) {
                    
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
break;
                }
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int i25213 =
                  i25216;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array p$25204 =
                  ((x10.array.Array)(result));
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25205 =
                  i25213;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final java.util.Random t25206 =
                  rnd;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25207 =
                  t25206.nextInt((int)(100));
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25208 =
                  attribThreshold;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25209 =
                  ((t25207) > (((int)(t25208))));
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int t25210 =
                   0;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25209) {
                    
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t25210 = 1;
                } else {
                    
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
t25210 = 0;
                }
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int p$25211 =
                  t25210;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
int ret25212 =
                   0;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array x$25195 =
                  p$25204;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$i25196 =
                  p$25205;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int x$v25197 =
                  p$25211;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25198 =
                  ((x10.array.Array<x10.core.Int>)x$25195).
                    rank;
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25199 =
                  ((int) t25198) ==
                ((int) 1);
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25200 =
                  !(t25199);
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25200) {
                    
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final boolean t25201 =
                      true;
                    
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
if (t25201) {
                        
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.lang.FailedDynamicCheckException t25202 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
throw t25202;
                    }
                }
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25203 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x$25195).$set__1x10$array$Array$$T$G((int)(x$i25196),
                                                                                                           x10.core.Int.$box(x$v25197)));
                
//#line 88 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
ret25212 = t25203;
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25214 =
                  i25216;
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final int t25215 =
                  ((t25214) + (((int)(1))));
                
//#line 87 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
i25216 = t25215;
            }
            
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final x10.array.Array t25018 =
              result;
            
//#line 91 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
return t25018;
        }
        
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final public org.xgdbench.generator.MAGIncremental
                                                                                                                org$xgdbench$generator$MAGIncremental$$this$org$xgdbench$generator$MAGIncremental(
                                                                                                                ){
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
return org.xgdbench.generator.MAGIncremental.this;
        }
        
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
final public void
                                                                                                                __fieldInitializers24666(
                                                                                                                ){
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.pThreshold = 0.0F;
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.affinityMatrix = null;
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.vertexAttribs = null;
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.attribCount = 0;
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGIncremental.x10"
this.attribThreshold = 40;
        }
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Float$2__1$1x10$lang$Int$3x10$array$Array$1x10$lang$Int$2$2 {}
    
}

