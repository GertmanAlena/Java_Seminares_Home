// public class tetris {
//     public static void main(String[] args) {
//         initFields();
    
//         while(!endOfGame){
//             input();
//             logic();
    
//             graphicsModule.draw(gameField);
//             graphicsModule.sync(FPS);
//         }
    
//         graphicsModule.destroy();
//     }
//     private static void input(){
//         /// Обновляем данные модуля ввода
//         keyboardModule.update();
    
//         /// Считываем из модуля ввода направление для сдвига падающей фигурки
//         shiftDirection = keyboardModule.getShiftDirection();
    
//         /// Считываем из модуля ввода, хочет ли пользователь повернуть фигурку
//         isRotateRequested = keyboardModule.wasRotateRequested();
    
//         /// Считываем из модуля ввода, хочет ли пользователь "уронить" фигурку вниз
//         isBoostRequested = keyboardModule.wasBoostRequested();
    
//         /// Если был нажат ESC или "крестик" окна, завершаем игру
//         endOfGame = endOfGame || keyboardModule.wasEscPressed() || graphicsModule.isCloseRequested();
//     }
// }
