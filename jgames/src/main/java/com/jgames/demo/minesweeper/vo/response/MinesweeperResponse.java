package com.jgames.demo.minesweeper.vo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.jgames.demo.minesweeper.domain.CellPosition;

@JsonInclude(Include.NON_NULL)
public record MinesweeperResponse(ResultType result
		                        , List<OpenCell> openCells
		                        , List<CellPosition> mines) {

}
