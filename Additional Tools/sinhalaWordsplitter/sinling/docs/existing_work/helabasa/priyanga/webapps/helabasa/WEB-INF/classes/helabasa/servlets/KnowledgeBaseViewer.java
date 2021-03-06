 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . H B J o i n T e s t e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   K n o w l e d g e B a s e V i e w e r   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
 	 p r i v a t e   s t a t i c   f i n a l   i n t   K B V _ P A G E _ S I Z E   =   1 0 ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 { 	 	  
 	         	 S t r i n g   s P a g e   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " o P a g e " ) ) ;  
 	         	  
 	         	 i n t   i P a g e   =   1 ;  
 	          
 	         	 i f ( s P a g e ! = n u l l )  
 	         	 {  
 	         	 	 i P a g e   =   I n t e g e r . p a r s e I n t ( s P a g e ) ;  
 	         	 }  
 	         	         	  
 	         	 p r i n t P a g e ( o R e q ,   o R e s ,   i P a g e ) ; 	         	  
 	 	 }  
         }  
 	  
  
 	  
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s ,   i n t   i P a g e )   t h r o w s   I O E x c e p t i o n  
         {         	  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
         	  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                 H e l a b a s a . I n i t ( ) ;  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                              
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   K n o w l e d g e   B a s e   V i e w < / t i t l e > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > \ n < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;                                                
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > S i n h a l a   L a n g u a g e   K n o w l e d g e   B a s e   (�����  ����  �����  ����� )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f n c o n j '   a c t i o n = ' . / k b _ v i e w '   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 4 > P a g e   "   +   G e t P a g e L i s t ( i P a g e ) ) ;  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b R e f r e s h '   v a l u e = ' R e f r e s h ' > < / h 4 > < / p > < / f o r m > " ) ;  
                  
                  
                 P r i n t R e s u l t s L i s t s ( o u t ,   i P a g e ) ;  
                  
                 o u t . p r i n t l n ( A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ) ;  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;                  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;                  
         }  
          
  
          
         p u b l i c   v o i d   P r i n t R e s u l t s L i s t s ( P r i n t W r i t e r   o u t ,   i n t   i P a g e )  
         {  
         	 l o n g   i F r o m   =   ( ( i P a g e - 1 ) * K B V _ P A G E _ S I Z E )   +   1 ;  
         	 l o n g   i T o   =   i P a g e * K B V _ P A G E _ S I Z E ;  
         	 o u t . p r i n t l n ( " < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' >   L e m m a   I D   f r o m   " +   i F r o m +   "   t o   "   +   i T o   +   " < / h 4 > < / p > " ) ;  
         	         	 	         	 	         	 	  
         	 o u t . p r i n t l n ( " < t a b l e   b o r d e r = 1   a l i g n = ' c e n t e r ' > " ) ;         	  
         	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > L e m m a   I D < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > L e m m a < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > L e m m a   T y p e < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > C l a s s < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > E x c e p t i o n s < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > U s e r   I D < / f o n t > < / t d > < / t r > " ) ;  
         	  
         	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;    
         	 L i s t < H B L e m m a >   l i s t L e m m a s   =   H B K n o w l e d g e B a s e . G e t L e m m a L i s t ( i F r o m ,   i T o ) ;         	  
         	  
         	 i f ( l i s t L e m m a s ! = n u l l )  
         	 {  
 	         	 i n t   i C o u n t   =   l i s t L e m m a s . s i z e ( ) ;  
 	         	  
 	         	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	         	 {  
 	         	 	 H B L e m m a   o L e m m a   =   l i s t L e m m a s . g e t ( i ) ;  
 	         	 	 P r i n t L e m m a ( o u t ,   o L e m m a ,   o R u l e s ) ;  
 	         	 }  
         	 }  
         	 o u t . p r i n t l n ( " < / t a b l e > " ) ;         	 	   	  
         }  
          
         p r o t e c t e d   S t r i n g   G e t P a g e L i s t ( i n t   i P a g e )  
         {  
         	 l o n g   i M a x I D   =   H B K n o w l e d g e B a s e . G e t M a x L e m m a I D ( ) ;  
         	  
         	 S t r i n g B u f f e r   s b L i s t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	  
       	 	 s b L i s t . a p p e n d ( " < s e l e c t   i d = ' o P a g e '   n a m e = ' o P a g e '   s t y l e = ' f o n t - s i z e :   1 6 ' > " ) ;  
         	         	  
         	 l o n g   i P a g e C o u n t   =   ( i M a x I D / K B V _ P A G E _ S I Z E )   +   1 ;  
         	  
         	 f o r ( i n t   i = 0 ;   i < i P a g e C o u n t ;   i + + )  
         	 {         	 	  
         	 	 i n t   i N u m   =   i   +   1 ;  
         	 	 i f ( i N u m = = i P a g e )  
         	 	 {  
         	 	 	 s b L i s t . a p p e n d ( " < o p t i o n   v a l u e = ' "   +   i N u m   +   " '   s e l e c t e d > "   +   i N u m   +   " < / o p t i o n > " ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 s b L i s t . a p p e n d ( " < o p t i o n   v a l u e = ' "   +   i N u m   +   " ' > "   +   i N u m   +   " < / o p t i o n > " ) ;  
         	 	 }  
         	 }  
         	  
         	 s b L i s t . a p p e n d ( " < / s e l e c t > " ) ;  
         	  
         	 r e t u r n   s b L i s t . t o S t r i n g ( ) ;         	  
         }  
          
         p r i v a t e   v o i d   P r i n t L e m m a ( P r i n t W r i t e r   o u t ,   H B L e m m a   o L e m m a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s )  
         {          
         	 o u t . p r i n t l n ( " < t r > < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o L e m m a . G e t I D ( )   +   " < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o L e m m a . G e t L e m m a W o r d ( ) . G e t N a t u r a l F o r m ( )   +   " < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o L e m m a . G e t L e m m a T y p e S t r i n g ( )   +   " < / t d > " ) ;  
         	  
         	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   o R u l e s . G e t R u l e S e t B y I D ( o L e m m a . G e t M o r p h R u l e I D ( ) ) ;  
         	  
         	 i f ( o R u l e S e t ! = n u l l )  
         	 {  
         	 	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o R u l e S e t . G e t N a m e ( )   +   " < / t d > < t d > " ) ;  
         	 }  
         	 e l s e  
         	 {  
         	 	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o L e m m a . G e t M o r p h R u l e I D ( )   +   " < / t d > < t d > " ) ; 	  
         	 }  
         	  
         	  
         	 S t r i n g B u f f e r   s b O u t   =   n e w   S t r i n g B u f f e r ( ) ;  
 	 	 i n t   i C o u n t   =   o L e m m a . G e t E x c e p t i o n C o u n t ( ) ; 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   o L e m m a . G e t E x c e p t i o n A t ( i ) ;  
 	 	 	  
 	 	 	 s b O u t . a p p e n d ( " [ " ) ;  
 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t T y p e ( ) ) ;  
 	 	 	 s b O u t . a p p e n d ( " - " ) ;  
 	 	 	 s b O u t . a p p e n d ( H B N o u n . a r r _ V i b h a k t h i [ o F o r m . G e t T y p e ( ) ] ) ; 	 	 	  
 	 	 	 s b O u t . a p p e n d ( " ]   [ " ) ;  
 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t S u b T y p e ( ) ) ;  
 	 	 	 s b O u t . a p p e n d ( " - " ) ;  
 	 	 	 s b O u t . a p p e n d ( H B N o u n . a r r _ N o u n C a t e g o r i e s [ o F o r m . G e t T y p e ( ) ] ) ; 	 	 	  
 	 	 	 s b O u t . a p p e n d ( " ]   :   " ) ; 	 	 	  
 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) ; 	 	 	  
 	 	 	  
 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 s b O u t . a p p e n d ( " < b r > " ) ; 	 	 	 	 	  
 	 	 	 }  
 	 	 }  
         	 o u t . p r i n t l n ( s b O u t . t o S t r i n g ( ) ) ;  
         	 o u t . p r i n t l n ( " < / t d > < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > "   +   o L e m m a . G e t C o n f i r m e d U s e r ( ) ) ;  
         	 o u t . p r i n t l n ( " < / t d > < / t r > " ) ;  
         }  
          
         p r o t e c t e d   v o i d   P r i n t R e s u l t s C e l l ( P r i n t W r i t e r   o u t ,   S t r i n g   s L e m m a ,   l o n g   l L e m m a I D ,   L i s t < H B F o r m >   l i s t F o r m s ,   S t r i n g   s C o n t r o l N a m e )  
         {        
         	 S t r i n g B u f f e r   s b O u t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	 i f ( l i s t F o r m s ! = n u l l )  
         	 {  
 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	 s b O u t . a p p e n d ( s L e m m a ) ;  
 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t M o d i f i e r ( ) ) ;  
 	 	 	 	 s b O u t . a p p e n d ( " = " ) ;  
 	 	 	 	  
 	 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) . a p p e n d ( " ,   " ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 }  
         	 }         	         	  
       	 	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > " ) ;         	  
         	 o u t . p r i n t l n ( s b O u t . t o S t r i n g ( ) ) ;  
 	 	 o u t . p r i n t l n ( " < / t d > " ) ;         	  
         }        
 }  
