	publics class static DynamicStack extends CustomStack{
	    public DynamicStack(int size){
	        super(size); 
	    }
	   public DynamicStack(){
	       super();
	   }
	    
	    @Override
	    public boolean push(int item){
	        if(this.isFull()){
	            int[] temp = data[i];
	            
	            for(int i =0; i<data.length; i++){
	                temp[i] = data[i];
	            }
	            
	            data = temp;
	            return super.push(item);
	        }
	    }
