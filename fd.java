import java.util.Vector;

public final class fd implements Runnable {
   private fa a;
   private Vector a = new Vector();

   public fd(fa var1) {
      this.a = var1;
   }

   public final void a(ez var1) {
      synchronized(this.a) {
         this.a.addElement(var1);
         this.a.notifyAll();
      }
   }

   public final void run() {
      try {
         while(this.a.a) {
            synchronized(this.a) {
               while(this.a.size() > 0) {
                  if (this.a.a) {
                     ez var2 = (ez)this.a.elementAt(0);
                     this.a.removeElementAt(0);
                     fa var10000;
                     byte[] var4;
                     if ((var4 = var2.a()) != null) {
                        if (var2.a) {
                           byte[] var5 = var4;
                           fe var10 = this.a.a;
                           int[] var6;
                           (var6 = new int[((var5.length >> 3) + (var5.length % 8 == 0 ? 0 : 1) << 1) + 1])[0] = var5.length;
                           fe.a(var5, var6, 1);
                           var10.a(var6);
                           var4 = fe.a(var6, 0, var6.length << 2);
                        }

                        this.a.a.writeInt(var4.length + 1);
                        this.a.a.writeByte(var2.a ? 1 : 0);
                        this.a.a.write(var4);
                        var10000 = this.a;
                        var10000.a += var4.length;
                     } else {
                        this.a.a.writeInt(0);
                     }

                     var10000 = this.a;
                     var10000.a += 4;
                     this.a.a.flush();
                  }
               }

               try {
                  this.a.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

      } catch (Exception var9) {
      }
   }

   public final void a() {
      synchronized(this.a) {
         this.a.removeAllElements();
         this.a.notifyAll();
      }
   }

   protected final void a(long var1) {
      byte[] var10000 = new byte[9];
      this.a.getClass();
      var10000[0] = 9;
      var10000[1] = (byte)((int)(var1 >>> 56));
      var10000[2] = (byte)((int)(var1 >>> 48));
      var10000[3] = (byte)((int)(var1 >>> 40));
      var10000[4] = (byte)((int)(var1 >>> 32));
      var10000[5] = (byte)((int)(var1 >>> 24));
      var10000[6] = (byte)((int)(var1 >>> 16));
      var10000[7] = (byte)((int)(var1 >>> 8));
      var10000[8] = (byte)((int)var1);
      byte[] var3 = var10000;
      this.a.a.write(var3);
      this.a.a.flush();
   }
}
