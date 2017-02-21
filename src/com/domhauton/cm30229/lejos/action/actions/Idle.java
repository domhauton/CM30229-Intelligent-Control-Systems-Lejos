package com.domhauton.cm30229.lejos.action.actions;

import com.domhauton.cm30229.lejos.action.movement.MovementController;

/**
 * Created by Dominic Hauton on 21/02/17.
 */
class Idle implements ExecutableAction {
  @Override
  public void execute(MovementController movementController) {
    movementController.getMotorLeft().stop();
    movementController.getMotorRight().stop();
  }
}