package com.mpplab.mpp_dna;

public class public_data {

	public public_data() {};
	
	//==================================================Setup======================================================

	public static final String DataSource = "Sequence";
	
	public static final int DelayCount = 40;	// Delay constraint
	public static final int SprsHold = 20;		// Suppression threshold
	
	public static final String logName = "log.txt";		// Log file name
	
	public static final String AlName = "AL1_NSPSGD";	// Algorithm name
//	public static final String AlName = "AL2_WSPSGD";
//	public static final String AlName = "AL3_Online";
	
	public static final boolean Debug = false;					// Whether output the debug info
	
	public static final String MPP_DataPfx = "F:\\MPP_DNA\\";	// Data store path prefix 

	public static int SqNum = 0;			// Sequence number
	public static int StaticCount = 0;	// Static handling Count
	
	// Sequence number of output average distance 
	public static int[] OutArgIndex = new int[]{};

	static{
		if(DataSource.equals("Sequence")){
			SqNum = 372;
			StaticCount = 124;
			OutArgIndex = new int[]{20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180};
		}
		else if(DataSource.equals("Sequence2")){
			SqNum = 540;
			StaticCount = 135;
			OutArgIndex = new int[]{30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280};
		}
		else if(DataSource.equals("Sequence3")){
			SqNum = 711;
			StaticCount = 176;
			OutArgIndex = new int[]{40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350};
		}
	}
		
	// Sequence alignment result distance matrix storage location 
	public static final String MatrixFile = MPP_DataPfx + "Data\\Aln\\matrix\\" + DataSource + ".txt";
	public static final String AllMatrixFile = MPP_DataPfx + "Data\\Aln\\AllMatrix\\" + DataSource + ".txt";
	
	// Sequence alignment input data file and output result file path 
	public static final String MultiInputPathPfx = MPP_DataPfx + "Data\\" + DataSource + "\\Multi\\";
	public static final String InputFile = MPP_DataPfx + "Data\\" + DataSource + "\\Multi\\" + SqNum + ".fasta";
	public static final String AllDataFile = MPP_DataPfx + "Data\\" + DataSource + "\\all.fasta";
	
	// Sequence alignment program path 
	public static final String ClustalPath = MPP_DataPfx + "Soft\\Clustal\\ClustalW2\\clustalw2.exe";		//Ô­Èí¼þ	
	public static final String OutputFile = MPP_DataPfx + "Data\\outBig.aln";

	// Gene Data Path prefix
	public static final String GeneDataPathPfx = MPP_DataPfx + "Data\\" + DataSource + "\\Single\\";
	
	// Maximum weight matching program path 
	public static final String MWMPath = MPP_DataPfx + "Soft\\dist\\mwmatching.exe";
	
	// The path of the maximum weight matching distance matrix and the output path 
	public static final String GroupDisFile = MPP_DataPfx + "Soft\\dist\\mwmInput.txt";
	public static final String GroupResFile = MPP_DataPfx + "Soft\\dist\\mwmOutput.txt";
	
	// Log file path
	public static final String LogPfx = MPP_DataPfx + "Log\\";
	
	// Infinite value of distance matrix 
	public static final int MAXDIS = 65535;		
}
