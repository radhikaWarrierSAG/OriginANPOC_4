package OriginOnPremIS_Test;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javasvc

{
	// ---( internal utility methods )---

	final static javasvc _instance = new javasvc();

	static javasvc _newInstance() { return new javasvc(); }

	static javasvc _cast(Object o) { return (javasvc)o; }

	// ---( server methods )---




	public static final void simpleaddItnt (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(simpleaddItnt)>> ---
		// @sigtype java 3.5
		// [i] field:0:required integer1
		// [i] field:0:required integer2
		// [o] field:0:required OutputString
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	integer1 = IDataUtil.getString( pipelineCursor, "integer1" );
		String	integer2 = IDataUtil.getString( pipelineCursor, "integer2" );
		pipelineCursor.destroy();
		
		Integer i=0; Integer j=0;
		i=Integer.parseInt(integer1);
		j=Integer.parseInt(integer2);
		int out = i+j;
		
		
		
		String OutputString = ""+out;
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "OutputString", OutputString );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

