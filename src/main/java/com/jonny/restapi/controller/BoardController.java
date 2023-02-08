package com.jonny.restapi.controller;

import com.jonny.restapi.domain.BoardVO;
import com.jonny.restapi.domain.ResultVO;
import com.jonny.restapi.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RequestMapping("/api")
@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }


    @PostMapping("/board")
    public ResponseEntity<Integer> insertBoard(@RequestBody BoardVO boardVO) throws Exception {
        Integer result = boardService.insertBoard(boardVO);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @GetMapping("/boards")
    public ResponseEntity<List<BoardVO>> getBoardItems() throws Exception {
        List<BoardVO> resultList = boardService.getBoardItems();

        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<BoardVO> getBoard(@PathVariable int id) throws Exception {
        BoardVO result = boardService.getBoard(id);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/board")
    public ResponseEntity<Integer> updateBoard(@ResponseBody BoardVO boardVO) {
        
    }

    @DeleteMapping("/board")
    public ResponseEntity<Integer> deleteBoard(@ResponseBody BoardVO boardVO) {

    }

}
