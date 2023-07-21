import java.util.*;

public class Manager {
    private int idNumber;
    List<Task> tasksList = new ArrayList<>();

    Map<UUID, Task> tasksMap = new HashMap<>();


    public List<Task> getTasksList() {
        return tasksList;
    }

    /**
     * Удаляет все элементы списка tasksList.
     */
    public void removeAllTasks() {
        tasksList.clear();
        System.out.println("Задачи удалены");
    }

    /**
     * Проверяет на null tasksList, ищет по Id объект, при нахождении возвращает с помощью метода returnTask();
     *
     * @param id - объекта, который нужно найти и вернуть.
     */
    public void getById(UUID id) {
        Task result = null;
        if (tasksList != null) {
            for (Task task : tasksList) {
                if (task.getId() != null && task.getId() == id) {
                    result = task;
                    returnTask(result);
                    System.out.println("Task found by id  = " + id);
                }
            }
        } else {
            System.out.println("Такой задачи нет");
        }
    }

    /**
     * Возвращает переданный обьект типа Task.
     *
     * @param task
     * @return
     */
    private Task returnTask(Task task) {
        return task;
    }

    /**
     * Добавляет в tasksList переданный объект/задачу.
     *
     * @param task - объект типа Task, также может принять обьекты наследников Task.
     */
    public void addNewTask(Task task) {
        tasksList.add(task);
        System.out.println("task added with Id = " + task.getId());
    }

    /**
     * Проверяет на null tasksList, ищет объект с равным  Id и найденный объект заменяет на updatedTask.
     *
     * @param updatedTask - обновленный обьект, который нужно вставить при совпадении Id вместо найденного в tasksList.
     */
    public void updateTask(Task updatedTask) {
        if (tasksList != null) {
            for (Task task : tasksList) {
                if (task.getId() != null && task.getId() == updatedTask.getId()) {
                    tasksList.set(tasksList.indexOf(task), updatedTask);
                    System.out.println("Задача обновлена");
                } else {
                    System.out.println("Такой задачи нет");
                }
            }
        }

    }

    /**
     * Проверяет на null tasksList, ищет объект с равным  Id и удаляет из updatedTask.
     *
     * @param id - объекта, который нужно найти и удалить из updatedTask.
     */
    public void deleteById(UUID id) {
        if (tasksList != null) {
            for (Task task : tasksList) {
                if (task.getId() != null && task.getId() == id) {
                    tasksList.remove(tasksList.indexOf(task));
                    System.out.println("Task deleted by id  = " + id);
                }
            }
        } else {
            System.out.println("Такой задачи нет");
        }
    }


}
