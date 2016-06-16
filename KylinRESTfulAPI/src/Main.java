
public class Main {

	public static void main(String[] args){
		String output ; 
		KylinHttpBasic.login("ADMIN","KYLIN");	
		
		//------------------------------------------------------------
		String body = "{\"sql\":\"select * from FACT_\",\"offset\":0,\"limit\":50000,\"acceptPartial\":false,\"project\":\"my_kylin\"}";	
		output = KylinHttpBasic.query(body);	
//		//--------------------------------------------------------------------
//		output = KylinHttpBasic.listQueryableTables("my_kylin");	
//		//----------------list all cutes------------------------------
//		output = KylinHttpBasic.listCubes(0,15,"my_kylin_cube", "my_kylin");
//		//----------------------------------------------------------------
//		output = KylinHttpBasic.getCube("my_kylin_cube");			
//		//----------------list my_kylin_cube information--------------
//		output = KylinHttpBasic.getCubeDes("my_kylin_cube");		
//		//----------------get data model-------------------------
//		output = KylinHttpBasic.getDataModel("my_kylin_model");
//		//------------------------------------------------------------
			
//		body = "{\"startTime\":\"\",\"endTime\":\"\",\"buildType\":\"\"}";
//		output = KylinHttpBasic.buildCube("my_kylin_cube",body);		

		
		//		//--------------------------------------------------------
//		output = KylinHttpBasic.enableCube("my_kylin_cube");		
//		//-------------------------------------------------------
//		output = KylinHttpBasic.disableCube("my_kylin_cube");
//		//-------------------------------------------------------------------
//		output = KylinHttpBasic.purgeCube("my_kylin_cube");		
//		//--------------------------------------------------------------------

		//		String jobId="test";
		//		output = KylinHttpBasic.resumeJob(jobId);	
//		//--------------------------------------------------------------------	
//		jobId="test";
//		output = KylinHttpBasic.discardJob(jobId);	
//		//--------------------------------------------------------------------	
//		jobId="test";
//		output = KylinHttpBasic.getJobStatus(jobId);
//		//------------------------------------------------------------------		
//		jobId="test";
//		String stepId ="test";
//		output = KylinHttpBasic.getJobStepOutput(jobId,stepId);
//		//--------------------------------------------------------------------
//		output = KylinHttpBasic.getHiveTable("FACT_");
//		//---------------------------------------------------------------------
//		output = KylinHttpBasic.getHiveTableInfo("FACT_");
//		//--------------------------------------------------------------
//		output = KylinHttpBasic.getHiveTables("my_kylin", true);
//		//-----------------------------------------------------------------
//		output  = KylinHttpBasic.loadHiveTables("FACT_", "my_kylin");	
//		//--------------------------------------------------------------------

		//output  = KylinHttpBasic.wipeCache("METADATA", "my_kylin_cube", "drop");
		
		System.out.println(output);
		
	}
}
