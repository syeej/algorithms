-- 조회수가 가장 높은 중고거래 게시물의 첨부파일 경로 조회
-- FILE ID 내림차순 정렬
-- 첨부파일 경로는 "/home/grep/src/" + "BORAD_ID/" + "FILE_ID" + "FILE_NAME" + "FILE_EXT"

SELECT CONCAT("/home/grep/src/", BOARD_ID, "/", FILE_ID, FILE_NAME, FILE_EXT) AS 'FILE_PATH'
FROM USED_GOODS_FILE
WHERE BOARD_ID = (
    SELECT BOARD_ID
    FROM USED_GOODS_BOARD
    ORDER BY VIEWS DESC
    LIMIT 1
)
ORDER BY FILE_ID DESC;