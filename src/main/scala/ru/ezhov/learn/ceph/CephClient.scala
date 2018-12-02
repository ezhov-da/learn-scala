package ru.ezhov.learn.ceph

import javax.swing.{JFrame, SwingUtilities, WindowConstants}

object CephClient extends App {
  SwingUtilities.invokeLater(() => {
    val frame = new JFrame()
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    frame.setSize(600, 400)
    frame.setLocationRelativeTo(null)
    frame.setVisible(true)
  })
}
