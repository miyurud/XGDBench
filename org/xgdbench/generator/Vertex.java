package org.xgdbench.generator;

@x10.runtime.impl.java.X10Generated public class Vertex extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Vertex> $RTT = x10.rtt.NamedType.<Vertex> make(
    "org.xgdbench.generator.Vertex", /* base class */Vertex.class
    
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.Vertex $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Vertex.class + " calling"); } 
        $_obj.pername = $deserializer.readLong();
        $_obj.neighbours = $deserializer.readRef();
        $_obj.attribs = $deserializer.readRef();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Vertex $_obj = new Vertex((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.pername);
        if (neighbours instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.neighbours);
        } else {
        $serializer.write(this.neighbours);
        }
        if (attribs instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.attribs);
        } else {
        $serializer.write(this.attribs);
        }
        
    }
    
    // constructor just for allocation
    public Vertex(final java.lang.System[] $dummy) { 
    }
    
        
//#line 11 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
public long pername;
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
public x10.array.Array<x10.core.Int> neighbours;
        
//#line 13 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
public x10.array.Array<x10.core.Int> attribs;
        
        
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
final public org.xgdbench.generator.Vertex
                                                                                                        org$xgdbench$generator$Vertex$$this$org$xgdbench$generator$Vertex(
                                                                                                        ){
            
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
return org.xgdbench.generator.Vertex.this;
        }
        
        
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
// creation method for java code (1-phase java constructor)
        public Vertex(){this((java.lang.System[]) null);
                            org$xgdbench$generator$Vertex$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.Vertex org$xgdbench$generator$Vertex$$init$S() { {
                                                                                                    
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
;
                                                                                                    
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"

                                                                                                    
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
this.__fieldInitializers25222();
                                                                                                }
                                                                                                return this;
                                                                                                }
        
        
        
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
final public void
                                                                                                        __fieldInitializers25222(
                                                                                                        ){
            
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
this.pername = 0L;
            
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
this.neighbours = null;
            
//#line 10 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/Vertex.x10"
this.attribs = null;
        }
    
}

