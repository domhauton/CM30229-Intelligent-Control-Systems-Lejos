package com.domhauton.cm30229.lejos.action.actions;

import com.domhauton.cm30229.lejos.action.movement.MovementController;

/**
 * Created by Ryan Cullen on 23/02/17.
 */
class RotateSmallLeft implements ExecutableAction {

  @Override
  public void execute(MovementController movementController) {
    movementController.smallLeftTurn();
  }
}
