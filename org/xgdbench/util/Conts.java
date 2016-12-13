package org.xgdbench.util;

@x10.runtime.impl.java.X10Generated public class Conts extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Conts> $RTT = x10.rtt.NamedType.<Conts> make(
    "org.xgdbench.util.Conts", /* base class */Conts.class
    
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.util.Conts $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Conts.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Conts $_obj = new Conts((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Conts(final java.lang.System[] $dummy) { 
    }
    
        
//#line 4 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"
final public static java.lang.String XGDBENCH_LOGGER_NAME = "org.xgdbench.log.xgdbench";
        
        
//#line 3 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"
final public org.xgdbench.util.Conts
                                                                                                 org$xgdbench$util$Conts$$this$org$xgdbench$util$Conts(
                                                                                                 ){
            
//#line 3 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"
return org.xgdbench.util.Conts.this;
        }
        
        
//#line 3 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"
// creation method for java code (1-phase java constructor)
        public Conts(){this((java.lang.System[]) null);
                           org$xgdbench$util$Conts$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.util.Conts org$xgdbench$util$Conts$$init$S() { {
                                                                                        
//#line 3 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"
;
                                                                                        
//#line 3 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/util/Conts.x10"

                                                                                    }
                                                                                    return this;
                                                                                    }
        
    
}

