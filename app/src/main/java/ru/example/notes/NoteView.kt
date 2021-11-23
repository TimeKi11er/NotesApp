package ru.example.notes

/**
 * Интерфейс для взаимодействия со View через Presenter
 */
interface NoteView {

    /**
     * Функция выводит сообщение с переданным ее тестом
     */
    fun showToast(typeMessage: String)

    /**
     * Функция очищает поле заголовка и поле текста заметки
     */
    fun clearFields()

    /**
     * Функция отправляет заголовок и текст заметки во внешнее приложение
     */
    fun shareNote(header: String, content: String)

}