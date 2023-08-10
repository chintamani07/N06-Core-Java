//program to demonstrate on heirarchical inheritance
package org.tnsif.heirarchicalinheritence;
//child class(B)
public class SnowCone extends Android {
//		private data members
		private int version;
//		getter method
		public int getVersion() 
		{
			return version;
		}
//		setter method
		public void setVersion(int version) 
		{
			this.version = version;
		}
//		parameterized constructor
		public SnowCone(String brand, String slotType, int version) 
		{
			super(brand, slotType);
			this.version=version;
		}
//		toString() method
		@Override
		public String toString() {
			return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
		}
}