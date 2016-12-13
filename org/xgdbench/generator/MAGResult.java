package org.xgdbench.generator;


@x10.runtime.impl.java.X10Generated public class MAGResult extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAGResult> $RTT = x10.rtt.NamedType.<MAGResult> make(
    "org.xgdbench.generator.MAGResult", /* base class */MAGResult.class
    
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.generator.MAGResult $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAGResult.class + " calling"); } 
        $_obj.nodesAttribs = $deserializer.readRef();
        $_obj.edges = $deserializer.readRef();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAGResult $_obj = new MAGResult((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        if (nodesAttribs instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.nodesAttribs);
        } else {
        $serializer.write(this.nodesAttribs);
        }
        if (edges instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.edges);
        } else {
        $serializer.write(this.edges);
        }
        
    }
    
    // constructor just for allocation
    public MAGResult(final java.lang.System[] $dummy) { 
    }
    
        
//#line 13 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
public x10.array.Array<x10.core.Byte> nodesAttribs;
        
//#line 15 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
public x10.array.Array<org.xgdbench.generator.MAGThread> edges;
        
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
final public org.xgdbench.generator.MAGResult
                                                                                                           org$xgdbench$generator$MAGResult$$this$org$xgdbench$generator$MAGResult(
                                                                                                           ){
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
return org.xgdbench.generator.MAGResult.this;
        }
        
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
// creation method for java code (1-phase java constructor)
        public MAGResult(){this((java.lang.System[]) null);
                               org$xgdbench$generator$MAGResult$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.generator.MAGResult org$xgdbench$generator$MAGResult$$init$S() { {
                                                                                                          
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
;
                                                                                                          
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"

                                                                                                          
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
this.__fieldInitializers29066();
                                                                                                      }
                                                                                                      return this;
                                                                                                      }
        
        
        
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
final public void
                                                                                                           __fieldInitializers29066(
                                                                                                           ){
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
this.nodesAttribs = null;
            
//#line 12 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/generator/MAGResult.x10"
this.edges = null;
        }
    
}

