import java.util.Vector;

public final class fc implements Runnable {
   private fa a;
   private Vector a = new Vector(10);

   public fc(fa var1) {
      this.a = var1;
   }

   public final void run() {
      while(true) {
         try {
            if (this.a.a) {
               fc var1 = this;
               int var2;
               ez var10000;
               if ((var2 = this.a.a.readInt()) == -1) {
                  var10000 = null;
               } else {
                  --var2;
                  byte var3 = (byte)this.a.a.read();
                  byte[] var4 = new byte[var2];
                  int var5 = 0;
                  int var6 = 0;

                  while(var5 != -1 && var6 < var2) {
                     if ((var5 = var1.a.a.read(var4, var6, var2 - var6)) > 0) {
                        var6 += var5;
                     }
                  }

                  if (var2 == 0) {
                     var10000 = null;
                  } else {
                     ez var11;
                     if (var3 == 1) {
                        var10000 = new ez;
                        fe var10 = var1.a.a;
                        byte[] var10002;
                        if (var4.length % 4 == 0 && (var4.length >> 2) % 2 == 1) {
                           int[] var12 = new int[var4.length >> 2];
                           fe.a(var4, var12, 0);
                           var10.b(var12);
                           var10002 = fe.a(var12, 1, var12[0]);
                        } else {
                           var10002 = null;
                        }

                        var10000.<init>(var10002);
                        var11 = var10000;
                     } else {
                        var11 = new ez(var4);
                     }

                     if (var1.a.a.available() <= 0) {
                        System.currentTimeMillis();
                     }

                     fa var13 = var1.a;
                     var13.b += var2 + 4;
                     var10000 = var11;
                  }
               }

               ez var9 = var10000;
               if (var10000 != null) {
                  if (this.a.b) {
                     synchronized(this.a) {
                        this.a.addElement(var9);
                        continue;
                     }
                  }

                  this.a.a.a(var9);
                  continue;
               }
            }
         } catch (Exception var8) {
         }

         if (this.a.a) {
            if (this.a.a != null) {
               this.a.a.c();
            }

            this.a.b();
         }

         return;
      }
   }

   public final void a() {
      synchronized(this.a) {
         int var2 = this.a.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.a.a.a((ez)this.a.elementAt(var3));
         }

         this.a.removeAllElements();
      }
   }
}
