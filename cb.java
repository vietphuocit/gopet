import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class cb extends eb {
   private ca a;
   private int a;
   private int b;
   private final bx a;

   public cb(bx var1, ea var2, int var3, ds var4) {
      super(var1, var2, (byte)var3, var4, (ds)null);
      this.a = var1;
      Image var8;
      gc var9;
      InputStream var10;
      int var11;
      switch(var3) {
      case 0:
         if (var1.a == null) {
            var8 = null;

            try {
               var8 = Image.createImage("/pet/petInteract/kiss.png");
            } catch (IOException var6) {
               var6.printStackTrace();
            }

            var9 = new gc();
            var10 = gj.a("/pet/petInteract/kiss");
            var9.a(new DataInputStream(var10));

            for(var11 = 0; var11 < var9.a.length; ++var11) {
               var9.a[var11].a = var8;
            }

            var1.a = new gb(var9.a[0]);
         }

         this.a = System.currentTimeMillis();
         return;
      case 1:
         if (var1.b == null) {
            var8 = null;

            try {
               var8 = Image.createImage("/pet/petInteract/play.png");
            } catch (IOException var5) {
               var5.printStackTrace();
            }

            var9 = new gc();
            var10 = gj.a("/pet/petInteract/play");
            var9.a(new DataInputStream(var10));

            for(var11 = 0; var11 < var9.a.length; ++var11) {
               var9.a[var11].a = var8;
            }

            var1.b = new gb(var9.a[0]);
         }

         this.a = System.currentTimeMillis();
         return;
      case 2:
         if (var1.c == null) {
            var8 = null;

            try {
               var8 = Image.createImage("/pet/petInteract/poke.png");
            } catch (IOException var7) {
               var7.printStackTrace();
            }

            var9 = new gc();
            var10 = gj.a("/pet/petInteract/poke");
            var9.a(new DataInputStream(var10));

            for(var11 = 0; var11 < var9.a.length; ++var11) {
               var9.a[var11].a = var8;
            }

            var1.c = new gb(var9.a[0]);
         }

         this.a = System.currentTimeMillis();
      default:
      }
   }

   public final void a() {
      bn var1;
      switch(this.a) {
      case 0:
         switch(this.b) {
         case 0:
            this.a = new ca(this.a, 0);
            var1 = ((bq)this.a).a;
            this.a.m = var1.m + 5;
            this.a.n = var1.n + 1;
            this.a.a((dz)this.a);
            this.a.c(this.a);
            this.b = 1;
            if (this.a.a != eg.a.a) {
               return;
            }

            this.a.b = false;
            return;
         case 1:
            if (System.currentTimeMillis() - this.a >= 2000L) {
               this.a.b(this.a);
               this.a = true;
               if (this.a.a == eg.a.a) {
                  this.a.b = true;
                  return;
               }
            }

            return;
         default:
            return;
         }
      case 1:
         switch(this.b) {
         case 0:
            this.a = new ca(this.a, 1);
            if ((var1 = ((bq)this.a).a) == null) {
               return;
            }

            this.a = var1.m;
            this.b = var1.n;
            var1.n = this.a.n;
            if (var1.m < this.a.m) {
               var1.m = this.a.m - 40;
               var1.a = 2;
               this.a.e = 0;
            } else {
               var1.m = this.a.m - 40;
               var1.a = 0;
               this.a.e = 1;
            }

            this.a.m = var1.m + this.a.m >> 1;
            this.a.n = var1.n + 1;
            this.a.a((dz)this.a);
            this.a.c(this.a);
            this.b = 1;
            if (this.a.a != eg.a.a) {
               return;
            }

            this.a.b = false;
            return;
         case 1:
            if (System.currentTimeMillis() - this.a >= 8000L) {
               this.a.b(this.a);
               this.a = true;
               if (this.a.a == eg.a.a) {
                  this.a.b = true;
               }

               (var1 = ((bq)this.a).a).m = this.a;
               var1.n = this.b;
            }

            return;
         default:
            return;
         }
      case 2:
         switch(this.b) {
         case 0:
            this.a = new ca(this.a, 2);
            var1 = ((bq)this.a).a;
            this.a.m = var1.m + 5;
            this.a.n = var1.n + 1;
            this.a.a((dz)this.a);
            this.a.c(this.a);
            this.b = 1;
            if (this.a.a == eg.a.a) {
               this.a.b = false;
               return;
            }
            break;
         case 1:
            if (System.currentTimeMillis() - this.a >= 2000L) {
               this.a.b(this.a);
               this.a = true;
               if (this.a.a == eg.a.a) {
                  this.a.b = true;
               }
            }
         }
      }

   }
}
