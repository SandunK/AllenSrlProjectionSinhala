 p a c k a g e   h e l a b a s a . s a n d h i . s c o r i n g ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
  
 p u b l i c   c l a s s   H B F r e q u e n c y B a s e d S c o r i n g A l g o r i t h m   i m p l e m e n t s   H B J o i n S c o r i n g A l g o r i t h m   {  
  
 	 p r i v a t e   s t a t i c   f i n a l   i n t   A I D _ J O I N _ F R E Q _ B A S E D _ S C O R I N G   =   1 ;  
 	  
 	 p r i v a t e   l o n g   l _ T h r e s h o l d   =   0 ;  
 	 p u b l i c   H B F r e q u e n c y B a s e d S c o r i n g A l g o r i t h m ( l o n g   l T h r e s h o l d )   {  
 	 	 l _ T h r e s h o l d   =   l T h r e s h o l d ;  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   S t r i n g   G e t N a m e ( )  
 	 {  
 	 	 r e t u r n   " F r e q u e n c y   B a s e d   S c o r i n g " ;  
 	 }  
  
 	 p u b l i c   i n t   G e t I D ( )  
 	 {  
 	 	 r e t u r n   A I D _ J O I N _ F R E Q _ B A S E D _ S C O R I N G ;  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   E v a l u a t e ( H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 { 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B B a s i c J o i n S c o r i n g A l g o r i t m : : E v a l u a t e   :   "   +   ( o R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) )   +   "   r e s u l t s . < b r > " ) ;              
 	 	  
 	 	 L i s t < H B W o r d >   l s t R e s u l t s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 o R e s u l t s S e t . G e t A l l R e s u l t s ( l s t R e s u l t s ) ;  
 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l s t R e s u l t s ) ; 	 	  
 	 	  
 	 	 i n t   i C o u n t   =   o R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t s   =   o R e s u l t s S e t . G e t R e s u l t s A t ( i ) ;  
 	 	 	 i f ( r e s u l t s . G e t R e s u l t ( ) . G e t F r e q u e n c y ( )   >   l _ T h r e s h o l d )  
 	 	 	 {  
 	 	 	 	 r e s u l t s . S e t S c o r e ( r e s u l t s . G e t R e s u l t ( ) . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B B a s i c J o i n S c o r i n g A l g o r i t m : : E v a l u a t e   [ "   +   i   +   " ]   :   M e t h o d = "   +   r e s u l t s . G e t J o i n M e t h o d ( )   +   "   :   S c o r e [ "   +   r e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   + " ] = "   +   r e s u l t s . G e t R e s u l t ( ) . G e t F r e q u e n c y ( )   +   " < b r > " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 { 	 	 	 	  
 	 	 	 	 r e s u l t s . S e t S c o r e ( - 1 ) ;  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B B a s i c J o i n S c o r i n g A l g o r i t m : : E v a l u a t e   [ "   +   i   +   " ]   :   M e t h o d = "   +   r e s u l t s . G e t J o i n M e t h o d ( )   +   "   :   S c o r e [ "   +   r e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   +   " ] = I G N O R E < b r > " ) ;  
 	 	 	 }  
 	 	 }  
 	 }  
  
 }  
