
SELECT DISTINCT C1.CART_ID
FROM CART_PRODUCTS C1
JOIN CART_PRODUCTS C2 ON C1.CART_ID = C2.CART_ID
WHERE C1.NAME = 'Milk' AND C2.NAME = 'Yogurt'
ORDER BY C1.CART_ID