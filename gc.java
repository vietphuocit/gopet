import java.io.DataInputStream;
import java.io.IOException;

public final class gc {
   public ga[] a;
   public gd[] a;
   public ge[] a;
   private int a;

   public final void a(DataInputStream var1) {
      try {
         this.a = var1.readByte();
         DataInputStream var3 = var1;
         gc var2 = this;
         byte var4 = var1.readByte();
         this.a = new ge[var4];

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            var2.a[var5] = new ge();
            var2.a[var5].a = var3.readInt();
            var2.a[var5].b = var3.readInt();
            var2.a[var5].c = var3.readInt();
            var2.a[var5].d = var3.readInt();
         }

         var3 = var1;
         var2 = this;
         var4 = var1.readByte();
         this.a = new gd[var4];

         byte var7;
         int var8;
         for(var5 = 0; var5 < var4; ++var5) {
            var2.a[var5] = new gd();
            gd var6 = var2.a[var5];
            var3.readByte();
            var7 = var3.readByte();
            var6.a = new byte[var7];
            var6.a = new int[var7];
            var6.b = new int[var7];
            var6.b = new byte[var7];

            for(var8 = 0; var8 < var7; ++var8) {
               var6.a[var8] = var3.readByte();
               var6.a[var8] = var3.readInt();
               var6.b[var8] = var3.readInt();
               var6.b[var8] = var3.readByte();
            }

            var6.a = new int[var2.a][3];
            byte var13 = var3.readByte();

            for(int var12 = 0; var12 < var13; ++var12) {
               byte var9 = var3.readByte();
               var6.a[var9][0] = 1;
               var6.a[var9][1] = var3.readInt();
               var6.a[var9][2] = var3.readInt();
            }
         }

         var3 = var1;
         var2 = this;
         var4 = var1.readByte();
         this.a = new ga[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            var2.a[var5] = new ga();
            var2.a[var5].a = var2;
            ga var11 = var2.a[var5];
            var3.readByte();
            var11.a = var3.readInt();
            var7 = var3.readByte();
            var11.b = var7;
            var11.a = new byte[var7];
            var11.a = new int[var7];

            for(var8 = 0; var8 < var7; ++var8) {
               var11.a[var8] = var3.readByte();
               var11.a[var8] = var3.readInt();
               if (var11.a[var8] == -1) {
                  var11.a[var8] = var11.a;
               }
            }
         }

         var1.close();
      } catch (IOException var10) {
         var10.printStackTrace();
      }
   }
}
